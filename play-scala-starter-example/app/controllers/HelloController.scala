package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._

@Singleton
class HelloController @Inject()(config: Configuration, cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {

  def index = Action {

    val helloConfiguration = config.getOptional[String]("application.name")

    val nombreparametro = valorParametro(helloConfiguration)
    Logger.info("Hola log.")

    //Results.Ok
    Ok(views.html.index(s"Hola mundo Play $nombreparametro ." ))

    /*1) redireccionando
      def index = Action {
      Redirect("/user/home")

      2)   o implemented todavia
      def index(name:String) = TODO

     */

  }

  def valorParametro(parametro: Any) :String = {
    parametro match {
      case None => "Parametro no encontrado"
      case Some(s: String) => s
      case _ => "otro"
    }
  }

}