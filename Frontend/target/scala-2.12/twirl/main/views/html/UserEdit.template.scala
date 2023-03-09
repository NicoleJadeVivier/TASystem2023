
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
/*2.2*/import play.api.routing.sird.?
/*3.2*/import play.api.routing.sird.?

object UserEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.14*/("""
"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <title>User Edit Page</title>
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
                .center """),format.raw/*23.25*/("""{"""),format.raw/*23.26*/("""
                    """),format.raw/*24.21*/("""text-align: center;
                """),format.raw/*25.17*/("""}"""),format.raw/*25.18*/("""

                """),format.raw/*27.17*/(""".cancel-form """),format.raw/*27.30*/("""{"""),format.raw/*27.31*/("""
                    """),format.raw/*28.21*/("""text-align: right;
                    padding-top: 0.5rem;
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
        """),format.raw/*31.9*/("""</style>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused center" style="font-size: 37px;
                color: #10ACE2">
                <strong>Edit Your Information</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="cancel-form">
                    <a href=""""),_display_(/*46.31*/routes/*46.37*/.HomeController.index()),format.raw/*46.60*/("""">
                        <i class="material-icons">close</i>
                    </a>
                </div>
                <div class="card-panel">
                    <form action=""""),_display_(/*51.36*/routes/*51.42*/.UserController.editUserHandler()),format.raw/*51.75*/("""" method="GET">
                        <div class="row">
                            <div class="col s12">
                                <input id="id" name="id" value="""),_display_(/*54.65*/user/*54.69*/.getId),format.raw/*54.75*/(""" """),format.raw/*54.76*/("""readOnly="true" class="validate">
                                <label for="id">ID (Uneditable)</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="firstname" name="firstname" value="""),_display_(/*61.79*/user/*61.83*/.getFirstname),format.raw/*61.96*/(""" """),format.raw/*61.97*/("""type="text" class="validate">
                                <label for="firstname">Firstname</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="lastname" name="lastname" value="""),_display_(/*68.77*/user/*68.81*/.getLastname),format.raw/*68.93*/(""" """),format.raw/*68.94*/("""type="text" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="email" name="email" value="""),_display_(/*75.71*/user/*75.75*/.getEmail),format.raw/*75.84*/(""" """),format.raw/*75.85*/("""type="text" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="phoneNumber" name="phoneNumber" value="""),_display_(/*82.83*/user/*82.87*/.getPhoneNumber),format.raw/*82.102*/(""" """),format.raw/*82.103*/("""type="text" class="validate">
                                <label for="phoneNumber">Phone Number</label>
                            </div>
                        </div>

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="address" name="address" value="""),_display_(/*89.75*/user/*89.79*/.getAddress),format.raw/*89.90*/(""" """),format.raw/*89.91*/("""type="text" class="validate">
                                <label for="address">Address</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="city" name="city" value="""),_display_(/*96.69*/user/*96.73*/.getCity),format.raw/*96.81*/(""" """),format.raw/*96.82*/("""type="text" class="validate">
                                <label for="city">City</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="region" name="region" value="""),_display_(/*103.73*/user/*103.77*/.getRegion),format.raw/*103.87*/(""" """),format.raw/*103.88*/("""type="text" class="validate">
                                <label for="region">Region</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="zipcode" name="zipcode" value="""),_display_(/*110.75*/user/*110.79*/.getZipcode),format.raw/*110.90*/(""" """),format.raw/*110.91*/("""type="text" class="validate">
                                <label for="zipcode">Zipcode</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="degreePlan" name="degreePlan" value="""),_display_(/*117.81*/user/*117.85*/.getDegreePlan),format.raw/*117.99*/(""" """),format.raw/*117.100*/("""type="text" class="validate">
                                <label for="degreePlan">Degree Plan</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="beginningSemester" name="beginningSemester" value="""),_display_(/*124.95*/user/*124.99*/.getStartSem),format.raw/*124.111*/(""" """),format.raw/*124.112*/("""type="text" class="validate">
                                <label for="beginningSemester">Beginning Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">

                                <input id="gradSemester" name="gradSemester" value="""),_display_(/*131.85*/user/*131.89*/.getEndSem),format.raw/*131.99*/(""" """),format.raw/*131.100*/("""type="text" class="validate">
                                <label for="gradSemester">Expected Graduating Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <button id="api-search-button" class="btn col s4 offset-s4" type="submit">Confirm</button>
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
                  DATE: 2023-03-09T16:08:06.480
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/UserEdit.scala.html
                  HASH: ffe31d9231986b0beb4586a3ce64890200a482e0
                  MATRIX: 651->1|680->25|718->58|1054->91|1161->103|1189->105|2600->1490|2629->1491|2679->1513|2744->1550|2773->1551|2821->1571|2862->1584|2891->1585|2941->1607|3047->1685|3076->1686|3113->1696|3556->2112|3571->2118|3615->2141|3834->2333|3849->2339|3903->2372|4105->2547|4118->2551|4145->2557|4174->2558|4563->2920|4576->2924|4610->2937|4639->2938|5023->3295|5036->3299|5069->3311|5098->3312|5475->3662|5488->3666|5518->3675|5547->3676|5929->4031|5942->4035|5979->4050|6009->4051|6396->4411|6409->4415|6441->4426|6470->4427|6842->4772|6855->4776|6884->4784|6913->4785|7284->5128|7298->5132|7330->5142|7360->5143|7737->5492|7751->5496|7784->5507|7814->5508|8199->5865|8213->5869|8249->5883|8280->5884|8686->6262|8700->6266|8735->6278|8766->6279|9176->6661|9190->6665|9222->6675|9253->6676
                  LINES: 24->1|25->2|26->3|31->4|36->4|37->5|55->23|55->23|56->24|57->25|57->25|59->27|59->27|59->27|60->28|62->30|62->30|63->31|78->46|78->46|78->46|83->51|83->51|83->51|86->54|86->54|86->54|86->54|93->61|93->61|93->61|93->61|100->68|100->68|100->68|100->68|107->75|107->75|107->75|107->75|114->82|114->82|114->82|114->82|121->89|121->89|121->89|121->89|128->96|128->96|128->96|128->96|135->103|135->103|135->103|135->103|142->110|142->110|142->110|142->110|149->117|149->117|149->117|149->117|156->124|156->124|156->124|156->124|163->131|163->131|163->131|163->131
                  -- GENERATED --
              */
          