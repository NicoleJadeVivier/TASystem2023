
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

object TAForm extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Play Setup Demo</title>
        <link rel="stylesheet" href="register.css"/>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>

        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
        <style>
            .center """),format.raw/*20.21*/("""{"""),format.raw/*20.22*/("""
                """),format.raw/*21.17*/("""text-align: center;
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused center" style="font-size: 37px;
                color: #10ACE2">
                <strong>Post a TA Position</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*38.36*/routes/*38.42*/.HomeController.newPositionHandler()),format.raw/*38.78*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">

                                <input id="title" name="title" type="text" class="validate">
                                <label for="title">Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="description" name="description" type="text" class="validate">
                                <label for="description">Description</label>
                            </div>
                        </div>
                        """),_display_(/*54.26*/if(authorizeMessage!= null)/*54.53*/{_display_(Seq[Any](format.raw/*54.54*/("""
                            """),format.raw/*55.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*56.30*/authorizeMessage),format.raw/*56.46*/("""
                            """),format.raw/*57.29*/("""</div>
                            <br>
                        """)))}),format.raw/*59.26*/("""

                        """),format.raw/*61.25*/("""<div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Submit</button>
                        </div>

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
                  DATE: 2023-03-05T07:41:10.677
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/TAForm.scala.html
                  HASH: 1d908248eec8ef8626dbed0e95c1d2a787f0acd5
                  MATRIX: 949->1|1070->27|1098->29|2412->1317|2441->1318|2487->1336|2548->1369|2577->1370|2614->1380|3058->1797|3073->1803|3130->1839|3897->2579|3933->2606|3972->2607|4030->2637|4134->2714|4171->2730|4229->2760|4327->2827|4383->2855
                  LINES: 28->1|33->1|34->2|52->20|52->20|53->21|54->22|54->22|55->23|70->38|70->38|70->38|86->54|86->54|86->54|87->55|88->56|88->56|89->57|91->59|93->61
                  -- GENERATED --
              */
          