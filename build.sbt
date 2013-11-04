name := "unfiltered-scalate"

organization := "net.databinder"

scalaVersion := "2.10.2"

version := "0.7.0"

seq(lsSettings :_*)

resolvers ++= Seq(
  "OSChina Maven Repo" at "http://maven.oschina.net/content/groups/public/"
)

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered" % "0.7.0",
  "org.fusesource.scalate" % "scalate-core_2.10" % "1.6.1"
)
