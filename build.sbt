import sbt._
import Keys._

name := "shocktrade-util"

organization := "com.ldaniels528"

version := "0.1.2"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-feature", "-target:jvm-1.7", "-unchecked",
    "-Ywarn-adapted-args", "-Ywarn-value-discard", "-Xlint")

javacOptions ++= Seq("-Xlint:deprecation", "-Xlint:unchecked", "-source", "1.7", "-target", "1.7", "-g:vars")

// General Dependencies
libraryDependencies ++= Seq(
	"joda-time" % "joda-time" % "2.3",
	"org.joda" % "joda-convert" % "1.6",
	"log4j" % "log4j" % "1.2.17"
)
	
// Testing Dependencies
libraryDependencies ++= Seq(
	"junit" % "junit" % "4.11" % "test"
)

resolvers ++= Seq(
    "Java Net" at "http://download.java.net/maven/2/",
    "Typesafe Releases Repository" at "http://repo.typesafe.com/typesafe/releases/",
    "Typesafe Snapshots Repository" at "http://repo.typesafe.com/typesafe/snapshots/",
    "Sonatype Repository" at "http://oss.sonatype.org/content/repositories/releases/"
)
                  
resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
