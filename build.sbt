organization := "io.druid.extensions"
name := "druid-spark-batch"

isSnapshot:=true

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"
libraryDependencies += "org.spark-project.akka" %% "akka-actor" % "2.3.4-spark"
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.4.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "io.druid" % "druid-processing" % "0.8.2-SNAPSHOT"
libraryDependencies += "io.druid" % "druid-server" % "0.8.2-SNAPSHOT"
libraryDependencies += "io.druid" % "druid-indexing-service" % "0.8.2-SNAPSHOT"
libraryDependencies += "io.druid" % "druid-indexing-hadoop" % "0.8.2-SNAPSHOT"
libraryDependencies += "com.sun.jersey" % "jersey-servlet" % "1.17.1"
libraryDependencies += "org.xerial.snappy" % "snappy-java" % "1.1.2-M1"

resolvers += Resolver.mavenLocal

