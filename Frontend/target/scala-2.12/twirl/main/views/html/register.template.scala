
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
        <style>
            .center """),format.raw/*56.21*/("""{"""),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""text-align: center;
            """),format.raw/*58.13*/("""}"""),format.raw/*58.14*/("""

            """),format.raw/*60.13*/(""".cancel-form """),format.raw/*60.26*/("""{"""),format.raw/*60.27*/("""
                """),format.raw/*61.17*/("""text-align: right;
                padding-top: 0.5rem;
            """),format.raw/*63.13*/("""}"""),format.raw/*63.14*/("""
        """),format.raw/*64.9*/("""</style>
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
                    <a href=""""),_display_(/*79.31*/routes/*79.37*/.HomeController.loginHandler()),format.raw/*79.67*/("""">
                        <i class="material-icons">close</i>
                    </a>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*84.36*/routes/*84.42*/.HomeController.signupHandler()),format.raw/*84.73*/("""" method="GET">

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
                        """),_display_(/*305.26*/if(authorizeMessage!= null)/*305.53*/{_display_(Seq[Any](format.raw/*305.54*/("""
                            """),format.raw/*306.29*/("""<div class="alert alert-primary" role="alert">
                            """),_display_(/*307.30*/authorizeMessage),format.raw/*307.46*/("""
                            """),format.raw/*308.29*/("""</div>
                            <br>
                        """)))}),format.raw/*310.26*/("""

                        """),format.raw/*312.25*/("""<div class="row">
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
                  DATE: 2023-03-04T20:16:02.055
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/register.scala.html
                  HASH: da3290d105fdec06414efef8af10797eafc2bfe0
                  MATRIX: 951->1|1071->28|2480->1411|2509->1412|2558->1433|2626->1473|2655->1474|2708->1499|2765->1528|2794->1529|2851->1558|2936->1615|2965->1616|2994->1617|3027->1622|3056->1623|3113->1652|3198->1709|3227->1710|3276->1731|3305->1732|3352->1751|3381->1752|3492->1835|3521->1836|3570->1857|3638->1897|3667->1898|3720->1923|3777->1952|3806->1953|3863->1982|3948->2039|3977->2040|4006->2041|4039->2046|4068->2047|4125->2076|4210->2133|4239->2134|4288->2155|4317->2156|4364->2175|4393->2176|4496->2251|4525->2252|4570->2269|4727->2398|4756->2399|4805->2420|4888->2475|4917->2476|4962->2493|5021->2524|5050->2525|5086->2534|5164->2584|5193->2585|5242->2606|5301->2637|5330->2638|5366->2647|5439->2692|5468->2693|5513->2710|5573->2742|5602->2743|5644->2757|5685->2770|5714->2771|5759->2788|5855->2856|5884->2857|5920->2866|6335->3254|6350->3260|6401->3290|6615->3477|6630->3483|6682->3514|18553->15357|18590->15384|18630->15385|18688->15414|18792->15490|18830->15506|18888->15535|18985->15600|19040->15626
                  LINES: 28->1|33->2|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|55->24|55->24|56->25|57->26|57->26|58->27|58->27|59->28|59->28|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|66->35|66->35|67->36|68->37|68->37|69->38|69->38|70->39|70->39|73->42|73->42|74->43|75->44|75->44|76->45|77->46|77->46|78->47|79->48|79->48|80->49|82->51|82->51|83->52|84->53|84->53|85->54|87->56|87->56|88->57|89->58|89->58|91->60|91->60|91->60|92->61|94->63|94->63|95->64|110->79|110->79|110->79|115->84|115->84|115->84|336->305|336->305|336->305|337->306|338->307|338->307|339->308|341->310|343->312
                  -- GENERATED --
              */
          