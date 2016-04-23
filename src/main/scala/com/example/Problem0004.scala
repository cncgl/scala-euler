package com.example

/**
  * 左右どちらから読んでも同じ値になる数を回文数という.
  * 2桁の数の積で表される回文数のうち, 最大のものは 9009 = 91 × 99 である.
  * では, 3桁の数の積で表される回文数の最大値を求めよ.
  */
object Problem0004 extends App {

  def palindrome(n: Int) :Boolean = {
    val s = n.toString
    s == s.reverse
  }

  def maxPalindrome(n: Int) :Int = {
    val ps =
      for (i <- Math.pow(10, n).toInt until Math.pow(10, n + 1).toInt;
           j <- i until Math.pow(10, n + 1).toInt) yield i * j

    ps.filter(palindrome(_)).max
  }

  println(maxPalindrome(1))
  println(maxPalindrome(2))

}
