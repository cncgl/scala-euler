package com.example

/**
  * 最初の10個の自然数について, その二乗の和は,
  * 12 + 22 + ... + 102 = 385
  * 最初の10個の自然数について, その和の二乗は,
  * (1 + 2 + ... + 10)2 = 3025
  * これらの数の差は 3025 - 385 = 2640 となる.
  * 同様にして, 最初の100個の自然数について二乗の和と和の二乗の差を求めよ.
  */
object Problem6 extends App {

  def sumSquare(a: Long) :Long = Math.pow((0L to a).sum, 2).toLong
  def squareSum(a: Long) :Long = (0L to a).map(x => x*x).sum
  def result(a: Long) :Long = sumSquare(a) - squareSum(a)

  println(result(10L))
  println(result(100L))

}
