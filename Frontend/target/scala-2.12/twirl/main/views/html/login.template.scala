
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    <style>
        .center """),format.raw/*18.17*/("""{"""),format.raw/*18.18*/("""
            """),format.raw/*19.13*/("""text-align: center;
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused center" style="font-size: 37px;
                color: #10ACE2">
                <strong>Login</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*36.36*/routes/*36.42*/.HomeController.loginHandler()),format.raw/*36.72*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">

                                <input id="username" name="username" type="text" class="validate">
                                <label for="username">Username</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="password" name="password" type="password" class="validate">
                                <label for="password">Password</label>
                            </div>
                        </div>
                        """),_display_(/*52.26*/if(authorizeMessage!= null)/*52.53*/{_display_(Seq[Any](format.raw/*52.54*/("""
                            """),format.raw/*53.29*/("""<div class="alert alert-primary" role="alert" style="font-size: 13px; color: #FF0000">
                            """),_display_(/*54.30*/authorizeMessage),format.raw/*54.46*/("""
                            """),format.raw/*55.29*/("""</div>
                            <br>
                        """)))}),format.raw/*57.26*/("""
                        """),format.raw/*58.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>
                        <a href=""""),_display_(/*61.35*/routes/*61.41*/.HomeController.signup()),format.raw/*61.65*/("""">REGISTER</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage) => apply(authorizeMessage)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-05T07:29:59.614
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/login.scala.html
                  HASH: 46c17047ae5bb450635e43898fff201fe5ddcd7f
                  MATRIX: 948->1|1068->28|2302->1236|2331->1237|2372->1250|2427->1278|2456->1279|2488->1284|2904->1673|2919->1679|2970->1709|3725->2437|3761->2464|3800->2465|3857->2494|4000->2610|4037->2626|4094->2655|4190->2720|4243->2745|4471->2946|4486->2952|4531->2976
                  LINES: 28->1|33->2|49->18|49->18|50->19|51->20|51->20|52->21|67->36|67->36|67->36|83->52|83->52|83->52|84->53|85->54|85->54|86->55|88->57|89->58|92->61|92->61|92->61
                  -- GENERATED --
              */
          