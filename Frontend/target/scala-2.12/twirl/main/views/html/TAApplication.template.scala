
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

object TAApplication extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,List[Course],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, courses: List[Course]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.37*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
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
                .center """),format.raw/*21.25*/("""{"""),format.raw/*21.26*/("""
                    """),format.raw/*22.21*/("""text-align: center;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""

                """),format.raw/*25.17*/(""".cancel-form """),format.raw/*25.30*/("""{"""),format.raw/*25.31*/("""
                    """),format.raw/*26.21*/("""text-align: right;
                    padding-top: 0.5rem;
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/("""
        """),format.raw/*29.9*/("""</style>
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
                    <a href=""""),_display_(/*44.31*/routes/*44.37*/.HomeController.index()),format.raw/*44.60*/("""">
                        <i class="material-icons">close</i>
                    </a>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*49.36*/routes/*49.42*/.HomeController.newApplicationHandler()),format.raw/*49.81*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="title" name="title" type="text" class="validate"/>
                                <label for="title">Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="firstname" name="firstname" value="""),_display_(/*60.79*/user/*60.83*/.getFirstname),format.raw/*60.96*/(""" """),format.raw/*60.97*/("""readonly="true" class="validate">
                                <label for="firstname">Firstname</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="lastname" name="lastname" value="""),_display_(/*67.77*/user/*67.81*/.getLastname),format.raw/*67.93*/(""" """),format.raw/*67.94*/("""readonly="true" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="email" name="email" value="""),_display_(/*74.71*/user/*74.75*/.getEmail),format.raw/*74.84*/(""" """),format.raw/*74.85*/("""readonly="true" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="phoneNumber" name="phoneNumber" value="""),_display_(/*81.83*/user/*81.87*/.getPhoneNumber),format.raw/*81.102*/(""" """),format.raw/*81.103*/("""readonly="true" class="validate">
                                <label for="phoneNumber">Phone Number</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="degreePlan" name="degreePlan" value="""),_display_(/*88.81*/user/*88.85*/.getDegreePlan),format.raw/*88.99*/(""" """),format.raw/*88.100*/("""readonly="true" class="validate">
                                <label for="degreePlan">Degree Plan</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="beginningSemester" name="beginningSemester" value="""),_display_(/*95.95*/user/*95.99*/.getStartSem),format.raw/*95.111*/(""" """),format.raw/*95.112*/("""readonly="true" class="validate">
                                <label for="beginningSemester">Beginning Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="gradSemester" name="gradSemester" value="""),_display_(/*102.85*/user/*102.89*/.getEndSem),format.raw/*102.99*/(""" """),format.raw/*102.100*/("""class="validate">
                                <label for="gradSemester">Expected Graduating Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <label for="preference1">Top preference</label>
                            <div class="input-field col s12">
                                """),_display_(/*109.34*/for(course <- courses) yield /*109.56*/ {_display_(Seq[Any](format.raw/*109.58*/("""
                                    """),format.raw/*110.37*/("""<p>
                                        <label>
                                            <input class="with-gap" name=preference1 type="radio" value=preference1" checked />
                                            <span>"""),_display_(/*113.52*/course/*113.58*/.getTitle),format.raw/*113.67*/(""", """),_display_(/*113.70*/course/*113.76*/.getName),format.raw/*113.84*/("""</span>
                                        </label>
                                    </p>
                                """)))}),format.raw/*116.34*/("""
                            """),format.raw/*117.29*/("""</div>
                        </div>
                        <div class="row">
                            <label for="preference2">Second preference</label>
                            <div class="input-field col s12">
                            """),_display_(/*122.30*/for(course <- courses) yield /*122.52*/ {_display_(Seq[Any](format.raw/*122.54*/("""
                                """),format.raw/*123.33*/("""<p>
                                    <label>
                                        <input class="with-gap" name=preference2 type="radio" value="preference2" checked />
                                        <span>"""),_display_(/*126.48*/course/*126.54*/.getTitle),format.raw/*126.63*/(""", """),_display_(/*126.66*/course/*126.72*/.getName),format.raw/*126.80*/("""</span>
                                    </label>
                                </p>
                            """)))}),format.raw/*129.30*/("""
                            """),format.raw/*130.29*/("""</div>
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

  def render(user:User,courses:List[Course]): play.twirl.api.HtmlFormat.Appendable = apply(user,courses)

  def f:((User,List[Course]) => play.twirl.api.HtmlFormat.Appendable) = (user,courses) => apply(user,courses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-08T20:43:00.222
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/TAApplication.scala.html
                  HASH: c8dbd196abe64e7363e12ffc4ebf2aab4ff6cedd
                  MATRIX: 651->1|996->25|1126->60|1154->62|2566->1448|2595->1449|2645->1471|2710->1508|2739->1509|2787->1529|2828->1542|2857->1543|2907->1565|3013->1643|3042->1644|3079->1654|3520->2068|3535->2074|3579->2097|3798->2289|3813->2295|3873->2334|4428->2862|4441->2866|4475->2879|4504->2880|4880->3229|4893->3233|4926->3245|4955->3246|5324->3588|5337->3592|5367->3601|5396->3602|5770->3949|5783->3953|5820->3968|5850->3969|6235->4327|6248->4331|6283->4345|6313->4346|6710->4716|6723->4720|6757->4732|6787->4733|7189->5107|7203->5111|7235->5121|7266->5122|7693->5521|7732->5543|7773->5545|7840->5583|8102->5817|8118->5823|8149->5832|8180->5835|8196->5841|8226->5849|8392->5983|8451->6013|8734->6268|8773->6290|8814->6292|8877->6326|9128->6549|9144->6555|9175->6564|9206->6567|9222->6573|9252->6581|9406->6703|9465->6733
                  LINES: 24->1|29->2|34->2|35->3|53->21|53->21|54->22|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|61->29|76->44|76->44|76->44|81->49|81->49|81->49|92->60|92->60|92->60|92->60|99->67|99->67|99->67|99->67|106->74|106->74|106->74|106->74|113->81|113->81|113->81|113->81|120->88|120->88|120->88|120->88|127->95|127->95|127->95|127->95|134->102|134->102|134->102|134->102|141->109|141->109|141->109|142->110|145->113|145->113|145->113|145->113|145->113|145->113|148->116|149->117|154->122|154->122|154->122|155->123|158->126|158->126|158->126|158->126|158->126|158->126|161->129|162->130
                  -- GENERATED --
              */
          