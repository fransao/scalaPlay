package errorhandler

import play.api.http.HttpErrorHandler
import play.api.mvc.Results._
import play.api.mvc.RequestHeader
import scala.concurrent._
import javax.inject.Singleton



@Singleton
class ErrorHandler extends HttpErrorHandler {

  def onClientError(request: RequestHeader, statusCode: Int, message: String) = {
    Future.successful(
      Status(statusCode)("A client error occurred: " + message)
    )
  }

  def onServerError(request: RequestHeader, exception: Throwable) = {
    Future.successful(
      InternalServerError("A server error occurred: " + exception.getMessage)
    )
  }
}