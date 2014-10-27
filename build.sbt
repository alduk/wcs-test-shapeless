organization  := "com.alduksoft"

version       := "0.1"

scalaVersion  := "2.11.2"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.5"
  Seq(
    "com.chuusai" %% "shapeless" % "2.0.0"
  )
}

//lazy val akka_api = RootProject(file("../wcs-akka-api"))

//lazy val root = project.in(file(".")).dependsOn(akka_api)