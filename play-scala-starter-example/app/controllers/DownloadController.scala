package controllers

import javax.inject._

import play.api.mvc._

@Singleton
class DownloadController @Inject()(cc: ControllerComponents) (implicit assetsFinder: AssetsFinder) extends AbstractController(cc) {

  def showpdf(nameFile: String) = Action {

    Ok(views.html.parqueadero("Descargar archivo ." ))
    /*Ok.sendFile(
      content = new java.io.File(s"/public/images/$nameFile.pdf"),
      fileName = _ => s"$nameFile.pdf"
    )*/

  }

  def show(nameFile: String) = Action {
    Ok(views.html.download(s"Descargar archivo $nameFile." ))


    /*val file = new java.io.File(s"/public/images/$nameFile.pdf")
    val path: java.nio.file.Path = file.toPath
    val source: Source[ByteString, _] = FileIO.fromPath(path)

    Result(
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Streamed(source, None, Some("application/pdf"))
    )*/

  }

}