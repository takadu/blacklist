import NativePackagerHelper._

name := "blacklist"

organization := "takadu"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0"
)

enablePlugins(JavaServerAppPackaging)

mainClass in Compile := Some("takadu.blacklist.Main")
