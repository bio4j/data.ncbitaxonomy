libraryDependencies ++= Seq(
  ) ++ testDependencies

val testDependencies = Seq(
  "org.scalatest" %% "scalatest"       % "3.0.4" % Test,
  "ohnosequences" %% "db-ncbitaxonomy" % "0.1.0"
)
