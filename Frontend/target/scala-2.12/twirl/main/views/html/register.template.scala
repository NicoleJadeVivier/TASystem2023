
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(authorizeMessage: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
        <script>
                $(document).ready(function() """),format.raw/*20.46*/("""{"""),format.raw/*20.47*/("""
                    """),format.raw/*21.21*/("""$('.student-checkbox').click(function() """),format.raw/*21.61*/("""{"""),format.raw/*21.62*/("""
                        """),format.raw/*22.25*/("""if ($(this).prop('checked')) """),format.raw/*22.54*/("""{"""),format.raw/*22.55*/("""
                            """),format.raw/*23.29*/("""$('[id="student-info"]').show();
                        """),format.raw/*24.25*/("""}"""),format.raw/*24.26*/(""" """),format.raw/*24.27*/("""else """),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""
                            """),format.raw/*25.29*/("""$('[id="student-info"]').hide();
                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""
                    """),format.raw/*27.21*/("""}"""),format.raw/*27.22*/(""");
                """),format.raw/*28.17*/("""}"""),format.raw/*28.18*/(""");
        </script>
        <script>
                $(document).ready(function() """),format.raw/*31.46*/("""{"""),format.raw/*31.47*/("""
                    """),format.raw/*32.21*/("""$('.faculty-checkbox').click(function() """),format.raw/*32.61*/("""{"""),format.raw/*32.62*/("""
                        """),format.raw/*33.25*/("""if ($(this).prop('checked')) """),format.raw/*33.54*/("""{"""),format.raw/*33.55*/("""
                            """),format.raw/*34.29*/("""$('[id="faculty-info"]').show();
                        """),format.raw/*35.25*/("""}"""),format.raw/*35.26*/(""" """),format.raw/*35.27*/("""else """),format.raw/*35.32*/("""{"""),format.raw/*35.33*/("""
                            """),format.raw/*36.29*/("""$('[id="faculty-info"]').hide();
                        """),format.raw/*37.25*/("""}"""),format.raw/*37.26*/("""
                    """),format.raw/*38.21*/("""}"""),format.raw/*38.22*/(""");
                """),format.raw/*39.17*/("""}"""),format.raw/*39.18*/(""");
        </script>
        <script>
            function checkOnClick(el)"""),format.raw/*42.38*/("""{"""),format.raw/*42.39*/("""
                """),format.raw/*43.17*/("""let checkboxesList = document.getElementsByClassName("a-checkbox");
                for(let i = 0; i<checkboxesList.length; i++) """),format.raw/*44.62*/("""{"""),format.raw/*44.63*/("""
                    """),format.raw/*45.21*/("""checkboxesList.item(i).checked = false
                """),format.raw/*46.17*/("""}"""),format.raw/*46.18*/("""
                """),format.raw/*47.17*/("""el.checked = true;
            """),format.raw/*48.13*/("""}"""),format.raw/*48.14*/("""
        """),format.raw/*49.9*/("""</script>
        <style>
                .hidden """),format.raw/*51.25*/("""{"""),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""display: none;
                """),format.raw/*53.17*/("""}"""),format.raw/*53.18*/("""
        """),format.raw/*54.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>Play Setup Demo</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*69.36*/routes/*69.42*/.HomeController.signupHandler()),format.raw/*69.73*/("""" method="GET">

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
                        """),_display_(/*290.26*/if(authorizeMessage!= null)/*290.53*/{_display_(Seq[Any](format.raw/*290.54*/("""
                            """),format.raw/*291.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*292.30*/authorizeMessage),format.raw/*292.46*/("""
                            """),format.raw/*293.29*/("""</div>
                            <br>
                        """)))}),format.raw/*295.26*/("""

                        """),format.raw/*297.25*/("""<div class="row">
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
                  DATE: 2023-03-01T22:12:44.637
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/register.scala.html
                  HASH: a46b1ad190a3bb174bdc8db6a945d5a67997fbbd
                  MATRIX: 951->1|1071->28|2393->1324|2422->1325|2471->1346|2539->1386|2568->1387|2621->1412|2678->1441|2707->1442|2764->1471|2849->1528|2878->1529|2907->1530|2940->1535|2969->1536|3026->1565|3111->1622|3140->1623|3189->1644|3218->1645|3265->1664|3294->1665|3405->1748|3434->1749|3483->1770|3551->1810|3580->1811|3633->1836|3690->1865|3719->1866|3776->1895|3861->1952|3890->1953|3919->1954|3952->1959|3981->1960|4038->1989|4123->2046|4152->2047|4201->2068|4230->2069|4277->2088|4306->2089|4409->2164|4438->2165|4483->2182|4640->2311|4669->2312|4718->2333|4801->2388|4830->2389|4875->2406|4934->2437|4963->2438|4999->2447|5077->2497|5106->2498|5155->2519|5214->2550|5243->2551|5279->2560|5698->2952|5713->2958|5765->2989|17636->14832|17673->14859|17713->14860|17771->14889|17875->14965|17913->14981|17971->15010|18068->15075|18123->15101
                  LINES: 28->1|33->2|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|59->28|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|66->35|66->35|67->36|68->37|68->37|69->38|69->38|70->39|70->39|73->42|73->42|74->43|75->44|75->44|76->45|77->46|77->46|78->47|79->48|79->48|80->49|82->51|82->51|83->52|84->53|84->53|85->54|100->69|100->69|100->69|321->290|321->290|321->290|322->291|323->292|323->292|324->293|326->295|328->297
                  -- GENERATED --
              */
          