// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Sun Mar 05 08:11:44 CST 2023

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addPosition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addPosition",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addPosition"})
        }
      """
    )
  
    // @LINE:23
    def newSpecificApplication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newSpecificApplication",
      """
        function(title0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newSpecificApplication/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("title", title0))})
        }
      """
    )
  
    // @LINE:10
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:8
    def loginHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:12
    def signupHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.signupHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:25
    def newApplicationHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newApplicationHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postApplication"})
        }
      """
    )
  
    // @LINE:19
    def newPositionHandler: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newPositionHandler",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "postTA"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:21
    def newApplication: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newApplication",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newApplication"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
