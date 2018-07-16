package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._


@Singleton
class CookiesController @Inject()(config: Configuration, cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {

  def ingreso  = Action {
    Logger.info("Cookies.")

    //Results.Ok
    Ok(views.html.parqueadero("Cookies : " )).withCookies(Cookie("theme", "blue")).bakeCookies()

    // Also, to discard a Cookie previously stored on the Web browser:
    // val result2 = result.discardingCookies(DiscardingCookie("theme"))

    // You can also set and remove cookies as part of the same response:
    // val result3 = result.withCookies(Cookie("theme", "blue")).discardingCookies(DiscardingCookie("skin"))

  }


}