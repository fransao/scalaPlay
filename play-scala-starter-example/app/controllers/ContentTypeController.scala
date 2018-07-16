package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._

@Singleton
class ContentTypeController @Inject()(config: Configuration, cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {

  def index = Action {

    //Results.Ok
    Ok(views.html.index("Cambiando el content type ." ))

    /*
    val textResult = Ok("Hello World!")
    //Will automatically set the Content-Type header to text/plain,

    // while:
    val xmlResult = Ok(<message>Hello World!</message>)
    will set the Content-Type header to application/xml.

    // Changing the default Content-Type
    val htmlResult = Ok(<h1>Hello World!</h1>).as("text/html")
    val htmlResult2 = Ok(<h1>Hello World!</h1>).as(HTML)

    */


  }


}