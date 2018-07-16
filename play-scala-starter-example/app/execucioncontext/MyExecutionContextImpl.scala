
import javax.inject._

import akka.actor.ActorSystem

import play.api.libs.concurrent.CustomExecutionContext



class MyExecutionContextImpl @Inject()(system: ActorSystem)  extends CustomExecutionContext(system, "my.executor") with MyExecutionContext


