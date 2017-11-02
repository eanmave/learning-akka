name := "akkademy-db"
organization := "com.akkademy-db"
version := "0.0.2-SNAPSHOT"

scalaVersion := "2.11.1"

lazy val akkaVersion = "2.5.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "junit" % "junit" % "4.12"
)
