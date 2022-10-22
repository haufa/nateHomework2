ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "HomeWork2"
  )

assembly / assemblyMergeStrategy  := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
)

libraryDependencies += "com.typesafe" % "config" % "1.4.2"
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.3"
libraryDependencies += "ch.qos.logback" % "logback-core" % "1.4.3"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.3"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
libraryDependencies += "org.scalatest" %% "scalatest-featurespec" % "3.2.14" % Test
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf"
libraryDependencies +=  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion
assembly / assemblyJarName := s"hausfat1-${name.value}_${version.value}.jar"