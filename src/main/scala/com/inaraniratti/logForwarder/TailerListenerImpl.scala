package com.inaraniratti.logForwarder

import org.apache.commons.io.input.TailerListenerAdapter

class TailerListenerImpl extends TailerListenerAdapter {
  override def handle(line: String): Unit = {
    println(line)
  }
}
