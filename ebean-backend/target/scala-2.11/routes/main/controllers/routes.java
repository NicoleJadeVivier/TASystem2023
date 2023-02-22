
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Wed Feb 22 16:36:35 CST 2023

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTAPositionController TAPositionController = new controllers.ReverseTAPositionController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTAApplicationController TAApplicationController = new controllers.ReverseTAApplicationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTAPositionController TAPositionController = new controllers.javascript.ReverseTAPositionController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTAApplicationController TAApplicationController = new controllers.javascript.ReverseTAApplicationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
  }

}
