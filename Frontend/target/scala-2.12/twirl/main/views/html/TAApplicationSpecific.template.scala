
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

object TAApplicationSpecific extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User, title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
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
                            <div class="col s12">
                                <input id="title" name="title" value=""""),_display_(/*52.72*/title),format.raw/*52.77*/("""" readonly="true" class="validate"/>
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

  def render(user:User,title:String): play.twirl.api.HtmlFormat.Appendable = apply(user,title)

  def f:((User,String) => play.twirl.api.HtmlFormat.Appendable) = (user,title) => apply(user,title)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-05T08:26:24.165
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/TAApplicationSpecific.scala.html
                  HASH: 773491bfbd8b455f5fba2aefc3eb4f311bc39650
                  MATRIX: 969->1|1091->28|1119->30|2531->1416|2560->1417|2610->1439|2675->1476|2704->1477|2752->1497|2793->1510|2822->1511|2872->1533|2978->1611|3007->1612|3044->1622|3485->2036|3500->2042|3544->2065|3763->2257|3778->2263|3838->2302|4049->2486|4075->2491|4448->2837|4461->2841|4495->2854|4524->2855|4900->3204|4913->3208|4946->3220|4975->3221|5344->3563|5357->3567|5387->3576|5416->3577|5790->3924|5803->3928|5840->3943|5870->3944|6255->4302|6268->4306|6303->4320|6333->4321|6730->4691|6743->4695|6777->4707|6807->4708|7209->5082|7223->5086|7255->5096|7286->5097
                  LINES: 28->1|33->1|34->2|52->20|52->20|53->21|54->22|54->22|56->24|56->24|56->24|57->25|59->27|59->27|60->28|75->43|75->43|75->43|80->48|80->48|80->48|84->52|84->52|91->59|91->59|91->59|91->59|98->66|98->66|98->66|98->66|105->73|105->73|105->73|105->73|112->80|112->80|112->80|112->80|119->87|119->87|119->87|119->87|126->94|126->94|126->94|126->94|133->101|133->101|133->101|133->101
                  -- GENERATED --
              */
          