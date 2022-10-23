ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "HomeWork2"
  )



libraryDependencies += "com.typesafe" % "config" % "1.4.2"
libraryDependencies += "org.slf4j" % "slf4j-api" % "2.0.3"
libraryDependencies += "ch.qos.logback" % "logback-core" % "1.4.4"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
libraryDependencies += "org.scalatest" %% "scalatest-featurespec" % "3.2.14" % Test
libraryDependencies +=  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion
libraryDependencies += "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion % "protobuf"

assembly / assemblyMergeStrategy  := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

Compile / PB.targets := Seq(
  scalapb.gen(grpc = true) -> (Compile / sourceManaged).value  / "scalapb"
)

assembly / assemblyJarName := s"hausfat1-${name.value}_${version.value}.jar"