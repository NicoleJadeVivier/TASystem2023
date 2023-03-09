package utils;

import akka.stream.javadsl.Source;
import akka.util.ByteString;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.typesafe.config.Config;
import play.Logger;
import play.api.Play;
import play.libs.Json;
import play.libs.ws.*;
import play.libs.ws.ahc.*;
import play.mvc.Http;

import java.util.concurrent.TimeUnit;
import java.util.function.*;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileOutputStream;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

public class RESTfulCalls {
    private static final WSClient WS;

    static {
        WS = Play.current().injector().instanceOf(WSClient.class);
    }

    // These are for internal response
    public static enum ResponseType {
        SUCCESS, GETERROR, SAVEERROR, DELETEERROR, RESOLVEERROR, TIMEOUT, CONVERSIONERROR, UNKNOWN
    }

    // These are for responding to users
    public static enum UserResponseType {
        SUCCESS, GENERALERROR
    }


    public static JsonNode getAPI(String apiString) {
        Logger.info(apiString);
        if (WS == null) {
            Logger.info("error");
        }
        try {
            CompletionStage<WSResponse> responsePromise = WS.url(apiString)
                    .setRequestTimeout(Duration.ofSeconds(30000))
                    .get();
            final CompletionStage<JsonNode> bodyPromise = responsePromise.thenApplyAsync(
                    new Function<WSResponse, JsonNode>() {
                        public JsonNode apply(WSResponse response) {
                            if (response.getStatus() == 200
                                    || response.getStatus() == 201) {
                                return response.asJson();
                            } else { // no response from the server
                                Logger.info("" + response.getStatus());
                                return createResponse(ResponseType.GETERROR);
                            }
                        }
                    });

            CompletableFuture<JsonNode> future = bodyPromise.toCompletableFuture();
            return future.get(30000, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println("get API exception: " + e);
            return createResponse(ResponseType.TIMEOUT);
        }
    }

    private static JsonNode createResponse(ResponseType type) {
        ObjectNode response = Json.newObject();
        switch (type) {
            case SUCCESS:
                response.put("status", "success");
                break;
            case GETERROR:
                response.put("status", "error");
                response.put("message", "Failed to get the requested resource");
                break;
            case SAVEERROR:
                response.put("status", "error");
                response.put("message", "Failed to save the resource");
                break;
            case DELETEERROR:
                response.put("status", "error");
                response.put("message", "Failed to delete the resource");
                break;
            case RESOLVEERROR:
                response.put("status", "error");
                response.put("message", "Failed to resolve the resource");
                break;
            case TIMEOUT:
                response.put("status", "error");
                response.put("message", "The operation timed out");
                break;
            case CONVERSIONERROR:
                response.put("status", "error");
                response.put("message", "Failed to convert the resource");
                break;
            default:
                response.put("status", "unknown");
                response.put("message", "An unknown error occurred");
                break;
        }
        return response;
    }

    /**
     * Creates a back-end url that can be passed on the API method calls, using the path.
     *
     * @param config the configuration settings.
     * @param path   the relative path to generate the full path from.
     * @return the absolute back-end path of the REST API to be called.
     */
    public static String getBackendAPIUrl(Config config, String path) {
        // Get the data from the application configuration.
        String protocol = config.getString("system.backend.rest-protocol");
        String host = config.getString("system.backend.rest-host");
        String port = config.getString("system.backend.rest-port");

        // Build a proper URL
        StringBuilder url = new StringBuilder(protocol + "://");
        url.append(host);
        if (port != null && port != "") {
            url.append(":" + port);
        }
        url.append(path);
        return url.toString();
    }
}

