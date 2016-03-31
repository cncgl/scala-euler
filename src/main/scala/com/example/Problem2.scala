package com.example

import scala.util.control.Breaks

/**
  * Created by shigeru on 16/03/30.
  */
object Problem2 {
  def main(args: Array[String]): Unit = {
    def fib(n: Int): BigInt = if (n < 2) n else fib(n -1) + fib(n - 2)
    def fibForm(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibForm(b, a+b)

    var i = 0
    var v: BigInt = 0
    var result: BigInt = 0
    val b = new Breaks
    b.breakable {
      while (true) {
        v = fib(i)
        if (v <= 4000000) {
          if (v % 2 == 0) result += v
          i += 1
        } else b.break
      }
    }
    println(result)
  }
}
