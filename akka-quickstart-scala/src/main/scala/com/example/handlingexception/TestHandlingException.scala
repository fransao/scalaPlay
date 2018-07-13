package com.example.handlingexception

import akka.actor.{ActorSystem, Props}

object TestHandlingException extends App {

  val system = ActorSystem("testSystem")
  val supervisingActor = system.actorOf(Props[SupervisingActor], "supervising-actor")
  supervisingActor ! "failChild"

}
