package com.nebtrx.dockerizedhttp4s

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    Testdockerizedhttp4sServer.stream[IO].compile.drain.as(ExitCode.Success)
}