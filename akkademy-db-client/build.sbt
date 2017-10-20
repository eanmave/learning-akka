name := "akkademy-db-client"
organization := "com.akkademy-db"
version := "1.0"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.akkademy-db" %% "akkademy-db" % "0.0.1-SNAPSHOT",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.8.0",
  "junit" % "junit" % "4.12"
)
