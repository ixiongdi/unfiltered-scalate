name := "unfiltered-scalate"

organization := "net.databinder"

crossScalaVersions := Seq(
  "2.9.1",
  "2.9.2",
  "2.10.0"
)

version := "0.6.8"

seq(lsSettings :_*)

libraryDependencies <++= scalaVersion { scalaVersion => Seq(
  "net.databinder" %% "unfiltered" % "0.6.8",
  "org.scala-lang" % "scala-compiler" % scalaVersion % "test",
  "org.mockito" % "mockito-core" % "1.9.5" % "test"
) ++ {
  val scalateVersion = "1.6.1"
  val v = if(scalaVersion.startsWith("2.9")) "2.9" else "2.10"
  Seq(
    "org.fusesource.scalate" % ("scalate-core_" + v) % scalateVersion,
    "org.fusesource.scalate" % ("scalate-util_" + v) % scalateVersion % "test"
  )
} ++ {
  val v = if(scalaVersion.startsWith("2.9")) "2.9.1" else "2.10"
  Seq("org.scala-tools.testing" % ("specs_" + v) % "1.6.9" % "test")
}
}
