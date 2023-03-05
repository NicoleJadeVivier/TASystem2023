
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

object TAApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""
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
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
        <style>
                .center """),format.raw/*20.25*/("""{"""),format.raw/*20.26*/("""
                    """),format.raw/*21.21*/("""text-align: center;
                """),format.raw/*22.17*/("""}"""),format.raw/*22.18*/("""

                """),format.raw/*24.17*/(""".cancel-form """),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""
                    """),format.raw/*25.21*/("""text-align: right;
                    padding-top: 0.5rem;
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""
        """),format.raw/*28.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused center" style="font-size: 37px;
                color: #10ACE2">
                <strong>TA Application Form</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="cancel-form">
                    <a href=""""),_display_(/*43.31*/routes/*43.37*/.HomeController.index()),format.raw/*43.60*/("""">
                        <i class="material-icons">close</i>
                    </a>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*48.36*/routes/*48.42*/.HomeController.newApplicationHandler()),format.raw/*48.81*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="title" name="title" type="text" class="validate"/>
                                <label for="title">Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="firstname" name="firstname" value="""),_display_(/*59.79*/user/*59.83*/.getFirstname),format.raw/*59.96*/(""" """),format.raw/*59.97*/("""readonly="true" class="validate">
                                <label for="firstname">Firstname</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="lastname" name="lastname" value="""),_display_(/*66.77*/user/*66.81*/.getLastname),format.raw/*66.93*/(""" """),format.raw/*66.94*/("""readonly="true" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="email" name="email" value="""),_display_(/*73.71*/user/*73.75*/.getEmail),format.raw/*73.84*/(""" """),format.raw/*73.85*/("""readonly="true" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="phoneNumber" name="phoneNumber" value="""),_display_(/*80.83*/user/*80.87*/.getPhoneNumber),format.raw/*80.102*/(""" """),format.raw/*80.103*/("""readonly="true" class="validate">
                                <label for="phoneNumber">Phone Number</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="degreePlan" name="degreePlan" value="""),_display_(/*87.81*/user/*87.85*/.getDegreePlan),format.raw/*87.99*/(""" """),format.raw/*87.100*/("""readonly="true" class="validate">
                                <label for="degreePlan">Degree Plan</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="beginningSemester" name="beginningSemester" value="""),_display_(/*94.95*/user/*94.99*/.getStartSem),format.raw/*94.111*/(""" """),format.raw/*94.112*/("""readonly="true" class="validate">
                                <label for="beginningSemester">Beginning Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="gradSemester" name="gradSemester" value="""),_display_(/*101.85*/user/*101.89*/.getEndSem),format.raw/*101.99*/(""" """),format.raw/*101.100*/("""class="validate">
                                <label for="gradSemester">Expected Graduating Semester</label>
                            </div>
                        </div>


                        <div class="row">
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

  def render(user:User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-05T08:25:30.836
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/TAApplication.scala.html
                  HASH: 5a2e3cdc3cee670421e53e4cd6fef9bc2374cd11
                  MATRIX: 954->1|1061->13|1089->15|2501->1401|2530->1402|2580->1424|2645->1461|2674->1462|2722->1482|2763->1495|2792->1496|2842->1518|2948->1596|2977->1597|3014->1607|3455->2021|3470->2027|3514->2050|3733->2242|3748->2248|3808->2287|4363->2815|4376->2819|4410->2832|4439->2833|4815->3182|4828->3186|4861->3198|4890->3199|5259->3541|5272->3545|5302->3554|5331->3555|5705->3902|5718->3906|5755->3921|5785->3922|6170->4280|6183->4284|6218->4298|6248->4299|6645->4669|6658->4673|6692->4685|6722->4686|7124->5060|7138->5064|7170->5074|7201->5075
                  LINES: 28->1|33->1|34->2|52->20|52->20|53->21|54->22|54->22|56->24|56->24|56->24|57->25|59->27|59->27|60->28|75->43|75->43|75->43|80->48|80->48|80->48|91->59|91->59|91->59|91->59|98->66|98->66|98->66|98->66|105->73|105->73|105->73|105->73|112->80|112->80|112->80|112->80|119->87|119->87|119->87|119->87|126->94|126->94|126->94|126->94|133->101|133->101|133->101|133->101
                  -- GENERATED --
              */
          