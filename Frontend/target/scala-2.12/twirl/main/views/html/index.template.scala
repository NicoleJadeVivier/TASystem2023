
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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <style>
            .body """),format.raw/*10.19*/("""{"""),format.raw/*10.20*/("""
                """),format.raw/*11.17*/("""margin-left: 2rem;
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
            """),format.raw/*13.13*/(""".outer-div """),format.raw/*13.24*/("""{"""),format.raw/*13.25*/("""
                """),format.raw/*14.17*/("""display: flex;
                flex-wrap: wrap;
            """),format.raw/*16.13*/("""}"""),format.raw/*16.14*/("""

            """),format.raw/*18.13*/(""".width """),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
                """),format.raw/*19.17*/("""width: 20rem;
                margin-right: 2rem;
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""

            """),format.raw/*23.13*/(""".spacer """),format.raw/*23.21*/("""{"""),format.raw/*23.22*/("""
                """),format.raw/*24.17*/("""flex-grow: 1;
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""

            """),format.raw/*27.13*/(""".profile """),format.raw/*27.22*/("""{"""),format.raw/*27.23*/("""
                """),format.raw/*28.17*/("""color: #10ACE2;
            """),format.raw/*29.13*/("""}"""),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</style>
    </head>
    <body class="body">

        <header class="topbar">
            <div class="outer-div">
                <div>
                    <h1 class="focused" style="font-size: 37px;
                        color: #10ACE2">
                        <Strong>"""),_display_(/*39.34*/authorizeMessage),format.raw/*39.50*/("""</Strong>
                        <strong> Dashboard</strong>
                    </h1>
                </div>
                <div class="spacer"></div>
                <div>
                    <a href=""""),_display_(/*45.31*/routes/*45.37*/.UserController.userEdit()),format.raw/*45.63*/("""">
                        <i class="medium material-icons profile">account_box</i>
                    </a>
                </div>
            </div>
        </header>
            <div class="outer-div">
                """),_display_(/*52.18*/for(pos <- positions) yield /*52.39*/ {_display_(Seq[Any](format.raw/*52.41*/("""
                    """),format.raw/*53.21*/("""<div class="s12 m7 card blue-grey darken-1 width">
                        <div class="card-content white-text">
                            <span class="card-title">"""),_display_(/*55.55*/pos/*55.58*/.getTitle),format.raw/*55.67*/("""</span>
                            <p>"""),_display_(/*56.33*/pos/*56.36*/.getDescription),format.raw/*56.51*/("""</p>
                        </div>
                        <div class="card-action">
                            <a href=""""),_display_(/*59.39*/routes/*59.45*/.HomeController.newSpecificApplication(pos.getTitle)),format.raw/*59.97*/("""" class="waves-effect waves-light btn">Apply</a>
                        </div>
                    </div>
                """)))}),format.raw/*62.18*/("""
            """),format.raw/*63.13*/("""</div>
            <!--<a href=""""),_display_(/*64.27*/routes/*64.33*/.HomeController.addPosition()),format.raw/*64.62*/("""">Post New Position</a>-->
            <br/>
        <div class="outer-div">
            <p style="color: #10ACE2">Unsure? Submit a general application</p>
            <a href=""""),_display_(/*68.23*/routes/*68.29*/.HomeController.newApplication()),format.raw/*68.61*/(""""><i class="material-icons" style="margin-top: 1rem">add</i></a>
        </div>

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
                  DATE: 2023-03-10T09:18:52.472
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: bfa69d14cc1d64dc5585d5c9a73ccdcbae804b2a
                  MATRIX: 651->1|994->24|1122->81|1188->119|1499->402|1528->403|1573->420|1632->451|1661->452|1702->465|1741->476|1770->477|1815->494|1903->554|1932->555|1974->569|2009->576|2038->577|2083->594|2173->656|2202->657|2244->671|2280->679|2309->680|2354->697|2408->723|2437->724|2479->738|2516->747|2545->748|2590->765|2646->793|2675->794|2711->803|3012->1077|3049->1093|3282->1299|3297->1305|3344->1331|3593->1553|3630->1574|3670->1576|3719->1597|3913->1764|3925->1767|3955->1776|4022->1816|4034->1819|4070->1834|4221->1958|4236->1964|4309->2016|4464->2140|4505->2153|4565->2186|4580->2192|4630->2221|4835->2399|4850->2405|4903->2437
                  LINES: 24->1|29->2|32->3|35->4|41->10|41->10|42->11|43->12|43->12|44->13|44->13|44->13|45->14|47->16|47->16|49->18|49->18|49->18|50->19|52->21|52->21|54->23|54->23|54->23|55->24|56->25|56->25|58->27|58->27|58->27|59->28|60->29|60->29|61->30|70->39|70->39|76->45|76->45|76->45|83->52|83->52|83->52|84->53|86->55|86->55|86->55|87->56|87->56|87->56|90->59|90->59|90->59|93->62|94->63|95->64|95->64|95->64|99->68|99->68|99->68
                  -- GENERATED --
              */
          