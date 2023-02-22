
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object info_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class info extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(infoMessages: Seq[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <body>
        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>User Info</strong>
            </h1>

        </header>
        """),_display_(/*12.10*/for(infoMessage <- infoMessages) yield /*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
            """),format.raw/*13.13*/("""<li>"""),_display_(/*13.18*/infoMessage),format.raw/*13.29*/("""</li>
        """)))}),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(infoMessages:Seq[String]): play.twirl.api.HtmlFormat.Appendable = apply(infoMessages)

  def f:((Seq[String]) => play.twirl.api.HtmlFormat.Appendable) = (infoMessages) => apply(infoMessages)

  def ref: this.type = this

}


}

/**/
object info extends info_Scope0.info
              /*
                  -- GENERATED --
                  DATE: Mon Feb 20 20:04:40 CST 2023
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/ebean-backend/app/views/info.scala.html
                  HASH: 328fc4b711d4db876a6b1e574414eef09fafc234
                  MATRIX: 748->1|870->28|898->30|1179->284|1227->316|1267->318|1309->332|1341->337|1373->348|1420->364|1453->370
                  LINES: 27->1|32->1|33->2|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          