
lazy val core = crossProject(JSPlatform, JVMPlatform)
    .enablePlugins(ScalatsGeneratorPlugin)
    .settings(
      scalaVersion := "2.13.8",
      scalacOptions := Seq(
        "-feature",
        "-language:_",
        "-deprecation"
      )
    )
    .jsSettings(
      scalaJSUseMainModuleInitializer in Global := true,
      scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },
    )
    .jvmSettings(/* ... */)
