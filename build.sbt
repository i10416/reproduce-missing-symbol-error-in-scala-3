lazy val repro = project
  .in(file("."))
  .settings(
    crossScalaVersions := Seq(
      "2.12.17",
      "2.13.10",
      "3.0.2",
      "3.1.3",
      "3.2.2",
      "3.3.0-RC3"
    )
  )
