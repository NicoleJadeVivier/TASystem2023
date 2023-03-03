
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import java.math.BigInteger;var i = 0


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <Strong>"""),_display_(/*13.26*/authorizeMessage),format.raw/*13.42*/("""</Strong>
                <strong>Dashboard</strong>
            </h1>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.addPosition()),format.raw/*16.58*/("""">Post New Position</a>
            <br/>
            <a href=""""),_display_(/*18.23*/routes/*18.29*/.HomeController.newApplication()),format.raw/*18.61*/("""">Create New Application</a>



        </header>

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
                  DATE: 2023-03-03T09:19:10.376
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/index.scala.html
                  HASH: 1014095ea9f7ea3c4c3ae16865360ec505c56767
                  MATRIX: 948->1|1047->29|1113->67|1464->391|1501->407|1621->500|1636->506|1686->535|1777->599|1792->605|1845->637
                  LINES: 28->1|31->2|34->3|44->13|44->13|47->16|47->16|47->16|49->18|49->18|49->18
                  -- GENERATED --
              */
          