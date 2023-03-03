
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/conf/routes
// @DATE:Thu Mar 02 08:32:50 CST 2023

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  UserController_1: controllers.UserController,
  // @LINE:15
  TAPositionController_3: controllers.TAPositionController,
  // @LINE:17
  TAApplicationController_2: controllers.TAApplicationController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    UserController_1: controllers.UserController,
    // @LINE:15
    TAPositionController_3: controllers.TAPositionController,
    // @LINE:17
    TAApplicationController_2: controllers.TAApplicationController
  ) = this(errorHandler, HomeController_0, UserController_1, TAPositionController_3, TAApplicationController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, UserController_1, TAPositionController_3, TAApplicationController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.authenticate()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.UserController.registerNew()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPosition""", """controllers.TAPositionController.addPosition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newApplication""", """controllers.TAApplicationController.newApplication()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """info""", """controllers.HomeController.info()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userData""", """controllers.HomeController.userData(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPositions""", """controllers.HomeController.allPositions()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_authenticate1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_authenticate1_invoker = createInvoker(
    UserController_1.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticate",
      Nil,
      "POST",
      """Login""",
      this.prefix + """login"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_registerNew2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_UserController_registerNew2_invoker = createInvoker(
    UserController_1.registerNew(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "registerNew",
      Nil,
      "POST",
      """ Add User  {"name":name, "password":password}""",
      this.prefix + """signup"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TAPositionController_addPosition3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPosition")))
  )
  private[this] lazy val controllers_TAPositionController_addPosition3_invoker = createInvoker(
    TAPositionController_3.addPosition(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAPositionController",
      "addPosition",
      Nil,
      "POST",
      """""",
      this.prefix + """addPosition"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TAApplicationController_newApplication4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newApplication")))
  )
  private[this] lazy val controllers_TAApplicationController_newApplication4_invoker = createInvoker(
    TAApplicationController_2.newApplication(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TAApplicationController",
      "newApplication",
      Nil,
      "POST",
      """""",
      this.prefix + """newApplication"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_info5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("info")))
  )
  private[this] lazy val controllers_HomeController_info5_invoker = createInvoker(
    HomeController_0.info(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "info",
      Nil,
      "GET",
      """""",
      this.prefix + """info"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_userData6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userData")))
  )
  private[this] lazy val controllers_HomeController_userData6_invoker = createInvoker(
    HomeController_0.userData(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "userData",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """userData"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_allPositions7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPositions")))
  )
  private[this] lazy val controllers_HomeController_allPositions7_invoker = createInvoker(
    HomeController_0.allPositions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "allPositions",
      Nil,
      "GET",
      """""",
      this.prefix + """getPositions"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_UserController_authenticate1_route(params) =>
      call { 
        controllers_UserController_authenticate1_invoker.call(UserController_1.authenticate())
      }
  
    // @LINE:13
    case controllers_UserController_registerNew2_route(params) =>
      call { 
        controllers_UserController_registerNew2_invoker.call(UserController_1.registerNew())
      }
  
    // @LINE:15
    case controllers_TAPositionController_addPosition3_route(params) =>
      call { 
        controllers_TAPositionController_addPosition3_invoker.call(TAPositionController_3.addPosition())
      }
  
    // @LINE:17
    case controllers_TAApplicationController_newApplication4_route(params) =>
      call { 
        controllers_TAApplicationController_newApplication4_invoker.call(TAApplicationController_2.newApplication())
      }
  
    // @LINE:18
    case controllers_HomeController_info5_route(params) =>
      call { 
        controllers_HomeController_info5_invoker.call(HomeController_0.info())
      }
  
    // @LINE:19
    case controllers_HomeController_userData6_route(params) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_HomeController_userData6_invoker.call(HomeController_0.userData(username))
      }
  
    // @LINE:20
    case controllers_HomeController_allPositions7_route(params) =>
      call { 
        controllers_HomeController_allPositions7_invoker.call(HomeController_0.allPositions())
      }
  }
}
