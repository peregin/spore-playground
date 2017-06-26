
organization := "com.github.peregin"

name := "spores-playground"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions ++= List("-target:jvm-1.6", "-feature", "-deprecation", "-language:implicitConversions")

net.virtualvoid.sbt.graph.Plugin.graphSettings

libraryDependencies += "ch.epfl.scala" %% "spores" % "0.4.3"

libraryDependencies += "org.scala-lang.modules" %% "scala-pickling" % "0.10.1"

addCompilerPlugin("ch.epfl.scala" %% "spores-serialization" % "0.4.3")


