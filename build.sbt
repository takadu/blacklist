import NativePackagerHelper._

name := "blacklist"

organization := "takadu"

version := "0.1.0"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.11.7"

publishMavenStyle := false

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0"
)

enablePlugins(JavaServerAppPackaging)

mainClass in Compile := Some("takadu.blacklist.Main")

deploymentSettings
