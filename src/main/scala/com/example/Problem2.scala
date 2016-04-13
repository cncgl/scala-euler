package com.example

import scala.util.control.Breaks

/**
  * フィボナッチ数列の項は前の2つの項の和である.
  * 最初の2項を 1, 2 とすれば, 最初の10項は以下の通りである.
  * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  * 数列の項の値が400万以下の, 偶数値の項の総和を求めよ.
  * Note:この問題は最近更新されました. お使いのパラメータが正しいかどうか確認してください.
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
