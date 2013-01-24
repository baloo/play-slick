name := "play-slick"

version := "0.2.7-SNAPSHOT"

organization := "com.typesafe"

scalaVersion := "2.10.0-RC1" //RC1 to harmonize with Play RC1

resolvers += "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Typesafe snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"

libraryDependencies ++= Seq(
  "play" %% "play" % "2.1-RC2",
  "play" %% "play-jdbc" % "2.1-RC2",
  "com.typesafe" %% "slick" % "1.0.0-RC1")

