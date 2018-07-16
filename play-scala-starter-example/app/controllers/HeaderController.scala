package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._


@Singleton
class HeaderController @Inject()(config: Configuration, cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {


  def ingreso  = Action {
    Logger.info("Headers.")

    //Results.Ok
    Ok(views.html.parqueadero("Header : " )).withHeaders(CACHE_CONTROL -> "max-age=3600", ETAG -> "xx")
  }


}