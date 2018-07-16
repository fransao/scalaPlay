package action

import javax.inject._
import play.api.Logger
import play.api.mvc._

import scala.concurrent.ExecutionContext
import scala.concurrent.Future

import dominio.Logging

class LoggingAction @Inject() (parser: BodyParsers.Default)(implicit ec: ExecutionContext) extends ActionBuilderImpl(parser) {

  override def invokeBlock[A](request: Request[A], block: (Request[A]) => Future[Result]) = {
    Logger.info("Calling action")
    block(request)
  }

  override def composeAction[A](action: Action[A]) = new Logging(action)

}