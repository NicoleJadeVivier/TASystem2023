
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
                flex-wrap: wrap;
            """),format.raw/*15.13*/("""}"""),format.raw/*15.14*/("""

            """),format.raw/*17.13*/(""".width """),format.raw/*17.20*/("""{"""),format.raw/*17.21*/("""
                """),format.raw/*18.17*/("""width: 20rem;
                margin-right: 2rem;
            """),format.raw/*20.13*/("""}"""),format.raw/*20.14*/("""
        """),format.raw/*21.9*/("""</style>
    </head>
    <body class="body">

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #10ACE2">
                <Strong>"""),_display_(/*28.26*/authorizeMessage),format.raw/*28.42*/("""</Strong>
                <strong> Dashboard</strong>
            </h1>
            <div class="outer-div">
                """),_display_(/*32.18*/for(pos <- positions) yield /*32.39*/ {_display_(Seq[Any](format.raw/*32.41*/("""
                    """),format.raw/*33.21*/("""<div class="s12 m7 card blue-grey darken-1 width">
                        <div class="card-content white-text">
                            <span class="card-title">"""),_display_(/*35.55*/pos/*35.58*/.getTitle),format.raw/*35.67*/("""</span>
                            <p>"""),_display_(/*36.33*/pos/*36.36*/.getDescription),format.raw/*36.51*/("""</p>
                        </div>
                        <div class="card-action">
                            <a href=""""),_display_(/*39.39*/routes/*39.45*/.HomeController.newSpecificApplication(pos.getTitle)),format.raw/*39.97*/("""" class="waves-effect waves-light btn">Apply</a>
                        </div>
                    </div>
                """)))}),format.raw/*42.18*/("""
            """),format.raw/*43.13*/("""</div>
            <a href=""""),_display_(/*44.23*/routes/*44.29*/.HomeController.addPosition()),format.raw/*44.58*/("""">Post New Position</a>
            <br/>
            <a href=""""),_display_(/*46.23*/routes/*46.29*/.HomeController.newApplication()),format.raw/*46.61*/("""">Create New Application</a>



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
                  DATE: 2023-03-05T08:24:23.941
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: 00b0e9c347e22bab5b83566b040de8c2930c6d66
                  MATRIX: 651->1|994->24|1122->81|1188->119|1403->307|1431->308|1476->325|1535->356|1564->357|1605->370|1644->381|1673->382|1718->399|1806->459|1835->460|1877->474|1912->481|1941->482|1986->499|2076->561|2105->562|2141->571|2360->763|2397->779|2549->904|2586->925|2626->927|2675->948|2869->1115|2881->1118|2911->1127|2978->1167|2990->1170|3026->1185|3177->1309|3192->1315|3265->1367|3420->1491|3461->1504|3517->1533|3532->1539|3582->1568|3673->1632|3688->1638|3741->1670
                  LINES: 24->1|29->2|32->3|35->4|40->9|40->9|41->10|42->11|42->11|43->12|43->12|43->12|44->13|46->15|46->15|48->17|48->17|48->17|49->18|51->20|51->20|52->21|59->28|59->28|63->32|63->32|63->32|64->33|66->35|66->35|66->35|67->36|67->36|67->36|70->39|70->39|70->39|73->42|74->43|75->44|75->44|75->44|77->46|77->46|77->46
                  -- GENERATED --
              */
          