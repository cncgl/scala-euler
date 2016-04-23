package com.example

import scala.util.control.Breaks.{breakable, break}

/**
  * ピタゴラス数(ピタゴラスの定理を満たす自然数)とは a < b < c で以下の式を満たす数の組である.
  * a2 + b2 = c2
  * 例えば, 32 + 42 = 9 + 16 = 25 = 52 である.
  *
  * a + b + c = 1000 となるピタゴラスの三つ組が一つだけ存在する.
  * これらの積 abc を計算しなさい.
  */
object Problem9 extends App {
  var a = 0
  var b = 0
  var c = 0
  val s = 1000
  breakable {
    for (i <- 1 until s / 3; j <- a until s / 2) {
      a = i
      b = j
      c = s - b - a
      if( a*a + b*b == c*c) break
    }
  }
  println(a, b, c)
  println(a*b*c)
}
