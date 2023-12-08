ThisBuild / name := "$name$"
ThisBuild / description := "$description$"
ThisBuild / organization := "$organization$"
ThisBuild / version := "$version$"
ThisBuild / scalaVersion := "$scalaVersion$"
ThisBuild / sbtVersion := "$sbtVersion$"
Global / excludeLintKeys := Set(name)

lazy val root = (project in file(".")).
  settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test,
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
)

scalacOptions ++= Seq(
  "-encoding", "utf8",
  "-feature",
  "-deprecation",
  "-unchecked",
  "-Wdead-code",
  "-Xfatal-warnings",
  "-Xlint",
  "-Ybackend-parallelism",
  "10"
)
