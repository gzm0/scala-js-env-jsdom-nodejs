addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.0")

libraryDependencies += "org.scala-js" %% "scalajs-env-nodejs" % "1.0.0"

unmanagedSourceDirectories in Compile +=
  baseDirectory.value.getParentFile / "jsdom-nodejs-env/src/main/scala"
