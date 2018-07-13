package com.example.startstop

import akka.actor.{Actor, ActorSystem, Props}

object TestStartStop extends App {

  val system = ActorSystem("testSystem")
  val first = system.actorOf(Props[StartStopActor1], "first")
  first ! "stop"

}
