

import sbt._

class LiftProject(info: ProjectInfo) extends DefaultWebProject(info)
with IdeaProject {
  val liftVersion = "2.3-RC3"
  
  /**
   * Application dependencies
   */
  val webkit    = "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default"
  val logback   = "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default"
  
  val servlet   = "javax.servlet" % "servlet-api" % "2.5" % "provided->default"
  val jetty6    = "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default"  
  val junit     = "junit" % "junit" % "4.5" % "test->default"
  val specs     = "org.scala-tools.testing" %% "specs" % "1.6.6" % "test->default"
  
  /**
   * Maven repositories
   */
  lazy val scalatoolsSnapshots = ScalaToolsSnapshots
}
