package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._

import action.LoggingAction

class MyController @Inject()(loggingAction: LoggingAction, cc:ControllerComponents) extends AbstractController(cc) {

  def index = loggingAction {
    Ok("Hello World")
  }

  def submit = loggingAction(parse.text) { request =>
    Ok("Got a body " + request.body.length + " bytes long")
  }

}