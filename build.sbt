import AssemblyKeys._

name := "Junto"

version := "1.2.2"

organization := "None"

scalaVersion := "2.9.1"

crossPaths := false

retrieveManaged := true

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "se.scalablesolutions.akka" % "akka-actor" % "1.2",
  "org.clapper" %% "argot" % "0.3.5",
  "net.sf.trove4j" % "trove4j" % "3.0.1"
)

seq(assemblySettings: _*)

jarName in assembly := "junto-assembly.jar"

