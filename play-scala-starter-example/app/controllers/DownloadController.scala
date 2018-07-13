package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class HelloController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {

  def show(nameFile: String) = Action {


    Ok.sendFile(
      content = new java.io.File(s"/public/images/$nameFile.pdf"),
      fileName = _ => s"$nameFile.pdf"
    )

  }

}