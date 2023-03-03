
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

        <script src="https://unpkg.com/leaflet@1.5.1/dist/leaflet.js" integrity="sha512-GffPMF3RvMeYyc1LWMHtK8EbPv0iNZ8/oTtHPx9/cc2ILxQ+u905qIwdpULaqDkyBKgOaB57QTMg7ztg8Jm2Og==" crossorigin=""></script>
    </head>
    <body>

        <header class="topbar">
            <h1 class="focused" style="font-size: 37px;
                color: #57a957">
                <strong>New TA Application</strong>
            </h1>
        </header>


        <div class="row">
            <div class="card col s4 offset-s4 ">
                <div class="card-panel">
                    <form action=""""),_display_(/*33.36*/routes/*33.42*/.HomeController.newApplicationHandler()),format.raw/*33.81*/("""" method="GET">

                        <div class="row">
                            <div class="input-field col s12">
                                <input id="title" name="title" type="text" class="validate"/>
                                <label for="title">Title</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="firstname" name="firstname" value="""),_display_(/*44.79*/user/*44.83*/.getFirstname),format.raw/*44.96*/(""" """),format.raw/*44.97*/("""readonly="true" class="validate">
                                <label for="firstname">Firstname</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="lastname" name="lastname" value="""),_display_(/*51.77*/user/*51.81*/.getLastname),format.raw/*51.93*/(""" """),format.raw/*51.94*/("""readonly="true" class="validate">
                                <label for="lastname">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="email" name="email" value="""),_display_(/*58.71*/user/*58.75*/.getEmail),format.raw/*58.84*/(""" """),format.raw/*58.85*/("""readonly="true" class="validate">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="phoneNumber" name="phoneNumber" value="""),_display_(/*65.83*/user/*65.87*/.getPhoneNumber),format.raw/*65.102*/(""" """),format.raw/*65.103*/("""readonly="true" class="validate">
                                <label for="phoneNumber">Phone Number</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="degreePlan" name="degreePlan" value="""),_display_(/*72.81*/user/*72.85*/.getDegreePlan),format.raw/*72.99*/(""" """),format.raw/*72.100*/("""readonly="true" class="validate">
                                <label for="degreePlan">Degree Plan</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="beginningSemester" name="beginningSemester" value="""),_display_(/*79.95*/user/*79.99*/.getStartSem),format.raw/*79.111*/(""" """),format.raw/*79.112*/("""readonly="true" class="validate">
                                <label for="beginningSemester">Beginning Semester</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">

                                <input id="gradSemester" name="gradSemester" value="""),_display_(/*86.85*/user/*86.89*/.getEndSem),format.raw/*86.99*/(""" """),format.raw/*86.100*/("""class="validate">
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
                  DATE: 2023-03-01T21:38:28.076
                  SOURCE: C:/Users/Nicole Vivier/Documents/CS4345/Play/Lab-2-Ebean/Lab-2-Ebean/Frontend/app/views/TAApplication.scala.html
                  HASH: 469271f505603176e7ea5f079f33e05d77413c48
                  MATRIX: 954->1|1061->13|1089->15|2765->1666|2780->1672|2840->1711|3395->2239|3408->2243|3442->2256|3471->2257|3847->2606|3860->2610|3893->2622|3922->2623|4291->2965|4304->2969|4334->2978|4363->2979|4737->3326|4750->3330|4787->3345|4817->3346|5202->3704|5215->3708|5250->3722|5280->3723|5677->4093|5690->4097|5724->4109|5754->4110|6155->4484|6168->4488|6199->4498|6229->4499
                  LINES: 28->1|33->1|34->2|65->33|65->33|65->33|76->44|76->44|76->44|76->44|83->51|83->51|83->51|83->51|90->58|90->58|90->58|90->58|97->65|97->65|97->65|97->65|104->72|104->72|104->72|104->72|111->79|111->79|111->79|111->79|118->86|118->86|118->86|118->86
                  -- GENERATED --
              */
          