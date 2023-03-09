// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/conf/routes
// @DATE:Thu Mar 09 15:52:44 CST 2023

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def addPosition(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addPosition")
    }
  
    // @LINE:23
    def newSpecificApplication(title:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newSpecificApplication/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("title", title)))
    }
  
    // @LINE:10
    def signup(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "signup")
    }
  
    // @LINE:8
    def loginHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:12
    def signupHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:25
    def newApplicationHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "postApplication")
    }
  
    // @LINE:19
    def newPositionHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "postTA")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:21
    def newApplication(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "newApplication")
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:27
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def editUserHandler(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateUser")
    }
  
    // @LINE:27
    def userEdit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userEdit")
    }
  
  }


}
