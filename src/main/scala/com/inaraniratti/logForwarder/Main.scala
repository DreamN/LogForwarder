package com.inaraniratti.logForwarder

import java.io.File

import org.apache.commons.io.input.{Tailer, TailerListenerAdapter}

object Main extends App {
  val listener: TailerListenerAdapter = new TailerListenerImpl()
  val filePath: String = ""
  val file: File = new File(filePath)
  val tailer: Tailer = Tailer.create(file, listener)
  tailer.run()
}
