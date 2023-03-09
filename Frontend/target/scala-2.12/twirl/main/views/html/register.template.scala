
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[Course],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(authorizeMessage: String, courses: List[Course]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>Register</title>
        <link rel="stylesheet" href="register.css"/>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

            <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <link rel="shortcut icon" type="image/x-icon" href="docs/images/favicon.ico" />
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.5.1/dist/leaflet.css" integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ==" crossorigin=""/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
        <script>
                $(document).ready(function() """),format.raw/*21.46*/("""{"""),format.raw/*21.47*/("""
                    """),format.raw/*22.21*/("""$('.student-checkbox').click(function() """),format.raw/*22.61*/("""{"""),format.raw/*22.62*/("""
                        """),format.raw/*23.25*/("""if ($(this).prop('checked')) """),format.raw/*23.54*/("""{"""),format.raw/*23.55*/("""
                            """),format.raw/*24.29*/("""$('[id="student-info"]').show();
                        """),format.raw/*25.25*/("""}"""),format.raw/*25.26*/(""" """),format.raw/*25.27*/("""else """),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""
                            """),format.raw/*26.29*/("""$('[id="student-info"]').hide();
                        """),format.raw/*27.25*/("""}"""),format.raw/*27.26*/("""
                    """),format.raw/*28.21*/("""}"""),format.raw/*28.22*/(""");
                """),format.raw/*29.17*/("""}"""),format.raw/*29.18*/(""");
        </script>
        <script>
                $(document).ready(function() """),format.raw/*32.46*/("""{"""),format.raw/*32.47*/("""
                    """),format.raw/*33.21*/("""$('.faculty-checkbox').click(function() """),format.raw/*33.61*/("""{"""),format.raw/*33.62*/("""
                        """),format.raw/*34.25*/("""if ($(this).prop('checked')) """),format.raw/*34.54*/("""{"""),format.raw/*34.55*/("""
                            """),format.raw/*35.29*/("""$('[id="faculty-info"]').show();
                        """),format.raw/*36.25*/("""}"""),format.raw/*36.26*/(""" """),format.raw/*36.27*/("""else """),format.raw/*36.32*/("""{"""),format.raw/*36.33*/("""
                            """),format.raw/*37.29*/("""$('[id="faculty-info"]').hide();
                        """),format.raw/*38.25*/("""}"""),format.raw/*38.26*/("""
                    """),format.raw/*39.21*/("""}"""),format.raw/*39.22*/(""");
                """),format.raw/*40.17*/("""}"""),format.raw/*40.18*/(""");
        </script>
        <script>
            function checkOnClick(el)"""),format.raw/*43.38*/("""{"""),format.raw/*43.39*/("""
                """),format.raw/*44.17*/("""let checkboxesList = document.getElementsByClassName("a-checkbox");
                for(let i = 0; i<checkboxesList.length; i++) """),format.raw/*45.62*/("""{"""),format.raw/*45.63*/("""
                    """),format.raw/*46.21*/("""checkboxesList.item(i).checked = false
                """),format.raw/*47.17*/("""}"""),format.raw/*47.18*/("""
                """),format.raw/*48.17*/("""el.checked = true;
            """),format.raw/*49.13*/("""}"""),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""</script>
        <style>
                .hidden """),format.raw/*52.25*/("""{"""),format.raw/*52.26*/("""
                    """),format.raw/*53.21*/("""display: none;
                """),format.raw/*54.17*/("""}"""),format.raw/*54.18*/("""
        """),format.raw/*55.9*/("""</style>
        <style>
            .center """),format.raw/*57.21*/("""{"""),format.raw/*57.22*/("""
                """),format.raw/*58.17*/("""text-align: center;
            """),format.raw/*59.13*/("""}"""),format.raw/*59.14*/("""

            """),format.raw/*61.13*/(""".cancel-form """),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
                """),format.raw/*62.17*/("""text-align: right;
                padding-top: 0.5rem;
            """),format.raw/*64.13*/("""}"""),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""</style>
    </head>
    <body>

        <header class="topbar center">
            <h1 class="focused" style="font-size: 37px;
                color: #10ACE2">
                <strong>Register</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="cancel-form">
                    <a href=""""),_display_(/*80.31*/routes/*80.37*/.HomeController.loginHandler()),format.raw/*80.67*/("""">
                        <i class="material-icons">close</i>
                    </a>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*85.36*/routes/*85.42*/.HomeController.signupHandler()),format.raw/*85.73*/("""" method="GET">

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
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="firstname" name="firstname" type="text" class="validate">
                                <label for="firstname">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="lastname" name="lastname" type="text" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <label for="title">Title</label>
                            <div class="input-field col s12">
                                <p>
                                    <label>
                                        <input class="with-gap" name=title type="radio" value="mr" checked />
                                        <span>Mr.</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="title" type="radio" value="ms"/>
                                        <span>Ms.</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="title" type="radio" value="mrs"/>
                                        <span>Mrs.</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="title" type="radio" value="dr"/>
                                        <span>Dr.</span>
                                    </label>
                                </p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="phoneNumber" name="phoneNumber" type="text" class="validate">
                                <label for="phoneNumber">Phone Number</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="fax" name="fax" type="text" class="validate">
                                <label for="fax">Fax</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="email" name="email" type="text" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="address" name="address" type="text" class="validate">
                                <label for="address">Address</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="city" name="city" type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="region" name="region" type="text" class="validate">
                                <label for="region">Region</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="zipcode" name="zipcode" type="text" class="validate">
                                <label for="zipcode">Zipcode</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label>
                                    <input type="checkbox" name="status" value="student" class="student-checkbox a-checkbox" onClick="checkOnClick(this);" />
                                    <span>Student</span>
                                </label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label>
                                    <input type="checkbox" name="status" value="faculty" class="faculty-checkbox a-checkbox" onClick="checkOnClick(this);"/>
                                    <span>Faculty</span>
                                </label>
                            </div>
                        </div>
                        <div class="row hidden" id="student-info">
                            <label for="status">Status</label>
                            <div class="input-field col s12">
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="phd"/>
                                        <span>Ph.D</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="dese"/>
                                        <span>D.E.-SE</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="mscs"/>
                                        <span>MS-CS</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="msse"/>
                                        <span>MS-SE</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="mscybersecurity"/>
                                        <span>MS-Cybersecurity</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="bscs"/>
                                        <span>BS-CS</span>
                                    </label>
                                </p>
                                <p>
                                    <label>
                                        <input class="with-gap" name="degreePlan" type="radio" value="bacs"/>
                                        <span>BA-CS</span>
                                    </label>
                                </p>
                            </div>
                        </div>
                        <div class="row hidden" id="student-info" >
                            <div class="input-field col s12">
                                <input id="startSem" name=startSem" type="text" class="validate">
                                <label for="startSem">Starting Semester (semester, year)</label>
                            </div>
                        </div>
                        <div class="row hidden" id="student-info" >
                            <div class="input-field col s12">
                                <input id="endSem" name="endSem" type="text" class="validate">
                                <label for="endSem">Expected Graduation (semester, year)</label>
                            </div>
                        </div>
                        <div class="row hidden" id="faculty-info">
                            <div class="input-field col s12">
                                <input type="text" id="faculty-position" name="faculty-position" class="validate" />
                                <label for="faculty-position">Faculty Position</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="comments" name="comments" type="text" class="validate" data-length="120">
                                <label for="comments">Comments</label>
                            </div>
                        </div>
                        <div>
                            <p>Please Answer the Following Security Questions</p>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="securityQ1"></label>
                                <p>What was the name of your third grade teacher?</p>
                                <input id="securityQ1" name="securityQ1" type="text" class="validate" data-length="120">
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="securityQ2"></label>
                                <p>How many siblings do you have?</p>
                                <input id="securityQ2" name="securityQ2" type="text" class="validate" data-length="120">
                            </div>
                        </div>
                        <div>
                            <p>Please Enter a Backup Email</p>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <label for="backupEmail">Email</label>
                                <input id="backupEmail" name="backupEmail" type="text" class="validate" data-length="120">
                            </div>
                        </div>
                        """),_display_(/*306.26*/if(authorizeMessage!= null)/*306.53*/{_display_(Seq[Any](format.raw/*306.54*/("""
                            """),format.raw/*307.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*308.30*/authorizeMessage),format.raw/*308.46*/("""
                            """),format.raw/*309.29*/("""</div>
                            <br>
                        """)))}),format.raw/*311.26*/("""

                        """),format.raw/*313.25*/("""<div class="row">
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

  def render(authorizeMessage:String,courses:List[Course]): play.twirl.api.HtmlFormat.Appendable = apply(authorizeMessage,courses)

  def f:((String,List[Course]) => play.twirl.api.HtmlFormat.Appendable) = (authorizeMessage,courses) => apply(authorizeMessage,courses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2023-03-09T15:52:44.744
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/register.scala.html
                  HASH: d87bea9d5a2d789bb4497f44521750be22ef7ea0
                  MATRIX: 651->1|993->24|1136->74|2545->1457|2574->1458|2623->1479|2691->1519|2720->1520|2773->1545|2830->1574|2859->1575|2916->1604|3001->1661|3030->1662|3059->1663|3092->1668|3121->1669|3178->1698|3263->1755|3292->1756|3341->1777|3370->1778|3417->1797|3446->1798|3557->1881|3586->1882|3635->1903|3703->1943|3732->1944|3785->1969|3842->1998|3871->1999|3928->2028|4013->2085|4042->2086|4071->2087|4104->2092|4133->2093|4190->2122|4275->2179|4304->2180|4353->2201|4382->2202|4429->2221|4458->2222|4561->2297|4590->2298|4635->2315|4792->2444|4821->2445|4870->2466|4953->2521|4982->2522|5027->2539|5086->2570|5115->2571|5151->2580|5229->2630|5258->2631|5307->2652|5366->2683|5395->2684|5431->2693|5504->2738|5533->2739|5578->2756|5638->2788|5667->2789|5709->2803|5750->2816|5779->2817|5824->2834|5920->2902|5949->2903|5985->2912|6400->3300|6415->3306|6466->3336|6680->3523|6695->3529|6747->3560|18618->15403|18655->15430|18695->15431|18753->15460|18857->15536|18895->15552|18953->15581|19050->15646|19105->15672
                  LINES: 24->1|29->2|34->3|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|56->25|56->25|56->25|56->25|56->25|57->26|58->27|58->27|59->28|59->28|60->29|60->29|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|67->36|67->36|67->36|67->36|67->36|68->37|69->38|69->38|70->39|70->39|71->40|71->40|74->43|74->43|75->44|76->45|76->45|77->46|78->47|78->47|79->48|80->49|80->49|81->50|83->52|83->52|84->53|85->54|85->54|86->55|88->57|88->57|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|96->65|111->80|111->80|111->80|116->85|116->85|116->85|337->306|337->306|337->306|338->307|339->308|339->308|340->309|342->311|344->313
                  -- GENERATED --
              */
          