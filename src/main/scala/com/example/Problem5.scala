package com.example

/**
  * 2520 は 1 から 10 の数字の全ての整数で割り切れる数字であり, そのような数字の中では最小の値である.
  * では, 1 から 20 までの整数全てで割り切れる数字の中で最小の正の数はいくらになるか.
  */
object Problem5 extends App {

  def gcd(a: Long, b: Long) :Long = if (b == 0) a else gcd(b, a % b)
  def lcm(a: Long, b: Long) :Long = a * b / gcd(a, b)

  def lcmSeq(f: Long, t: Long) :Long = (f to t).reduceLeft(lcm(_, _))

  println(lcmSeq(1L, 10L))
  println(lcmSeq(1L, 20L))

}
