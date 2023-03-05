
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
/*1.2*/import java.util.List

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[TAPosition],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(authorizeMessage: String, positions: List[TAPosition]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <style>
            .body """),format.raw/*9.19*/("""{"""),format.raw/*9.20*/("""
                """),format.raw/*10.17*/("""margin-left: 2rem;
            """),format.raw/*11.13*/("""}"""),format.raw/*11.14*/("""
            """),format.raw/*12.13*/(""".outer-div """),format.raw/*12.24*/("""{"""),format.raw/*12.25*/("""
                """),format.raw/*13.17*/("""display: flex;
            """),format.raw/*14.13*/("""}"""),format.raw/*14.14*/("""

            """),format.raw/*16.13*/(""".width """),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""
                """),format.raw/*17.17*/("""width: 20rem;
                margin-right: 2rem;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""</style>
    </head>
    <body class="body">

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #10ACE2">
                <Strong>"""),_display_(/*27.26*/authorizeMessage),format.raw/*27.42*/("""</Strong>
                <strong> Dashboard</strong>
            </h1>
            <div class="outer-div">
                """),_display_(/*31.18*/for(pos <- positions) yield /*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/("""
                    """),format.raw/*32.21*/("""<div class="s12 m7 card blue-grey darken-1 width">
                        <div class="card-content white-text">
                            <span class="card-title">"""),_display_(/*34.55*/pos/*34.58*/.getTitle),format.raw/*34.67*/("""</span>
                            <p>"""),_display_(/*35.33*/pos/*35.36*/.getDescription),format.raw/*35.51*/("""</p>
                        </div>
                        <div class="card-action">
                            <a class="waves-effect waves-light btn">Apply</a>
                        </div>
                    </div>
                """)))}),format.raw/*41.18*/("""
            """),format.raw/*42.13*/("""</div>
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.addPosition()),format.raw/*43.58*/("""">Post New Position</a>
            <br/>
            <a href=""""),_display_(/*45.23*/routes/*45.29*/.HomeController.newApplication()),format.raw/*45.61*/("""">Create New Application</a>



        </header>

    </body>
</html>
"""))
      }
    }
  }

  def render(authorizeMessage:String,positions:List[TAPosition]): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage,positions)

  def f:((String,List[TAPosition]) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage,positions) => apply(authorizeMessage,positions)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-04T21:01:52.085
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: 5d56ed4f1bd9dc7393d114806fa5e8de0ead5f8b
                  MATRIX: 651->1|994->24|1122->81|1188->119|1403->307|1431->308|1476->325|1535->356|1564->357|1605->370|1644->381|1673->382|1718->399|1773->426|1802->427|1844->441|1879->448|1908->449|1953->466|2043->528|2072->529|2108->538|2327->730|2364->746|2516->871|2553->892|2593->894|2642->915|2836->1082|2848->1085|2878->1094|2945->1134|2957->1137|2993->1152|3263->1391|3304->1404|3360->1433|3375->1439|3425->1468|3516->1532|3531->1538|3584->1570
                  LINES: 24->1|29->2|32->3|35->4|40->9|40->9|41->10|42->11|42->11|43->12|43->12|43->12|44->13|45->14|45->14|47->16|47->16|47->16|48->17|50->19|50->19|51->20|58->27|58->27|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|66->35|66->35|72->41|73->42|74->43|74->43|74->43|76->45|76->45|76->45
                  -- GENERATED --
              */
          