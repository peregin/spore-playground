
organization := "com.github.peregin"

name := "spores-playground"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions ++= List("-target:jvm-1.6", "-feature", "-deprecation", "-language:implicitConversions")

net.virtualvoid.sbt.graph.Plugin.graphSettings

libraryDependencies += "org.scala-lang.modules" %% "spores-core" % "0.1.3"

libraryDependencies += "org.scala-lang.modules" %% "spores-pickling" % "0.1.3"


