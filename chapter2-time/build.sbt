lazy val app = project.in(file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.0"
)

PlayKeys.devSettings += "play.server.http.port" -> "9090"
