name := "akkademy-db"
organization := "com.akkademy-db"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.2"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "junit" % "junit" % "4.12"
)

//Exclude from the build to be able to be used by the client
mappings in (Compile, packageBin) ~= { _.filterNot { case (_, name) => Seq("application.conf").contains(name)}}
