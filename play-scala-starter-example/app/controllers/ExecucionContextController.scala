package controllers

import javax.inject._

import play.api.Configuration
import play.api.Logger
import play.api.mvc._



//import execucioncontext.MyExecutionContext

@Singleton
//class ExecucionContextController @Inject()(myExecutionContext: MyExecutionContext, val controllerComponents: ControllerComponents) extends BaseController {
class ExecucionContextController @Inject()( val controllerComponents: ControllerComponents) extends BaseController {

  //def index = Action.async {
  def index = Action {
    /*Future {
      // Call some blocking API
      Ok("result of blocking call")
    }(myExecutionContext)
    */
    Ok("result of blocking call")
  }

}