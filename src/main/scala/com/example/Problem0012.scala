package com.example

import scala.util.control.Breaks.{break, breakable}

/**
  * 三角数の数列は自然数の和で表わされ, 7番目の三角数は 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28 である. 三角数の最初の10項は:
  *
  * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
  * となる.
  *
  * 最初の7項について, その約数を列挙すると, 以下のとおり.
  *
  *  1: 1
  *  3: 1,3
  *  6: 1,2,3,6
  * 10: 1,2,5,10
  * 15: 1,3,5,15
  * 21: 1,3,7,21
  * 28: 1,2,4,7,14,28
  *
  * これから, 7番目の三角数である28は, 5個より多く約数をもつ最初の三角数であることが分かる.
  *
  * では, 500個より多く約数をもつ最初の三角数はいくつか.
  */
// TODO: 1485s かかるので要改良
object Problem0012 extends App {

  def triangle(n: Long):Long = n * ( n + 1 ) / 2

  def countDivisor(n: Long):Long = {
    var count = 0
    for(i <- 1 to (n/2).asInstanceOf[Int]) {
      if(n % i == 0) count += 1
    }
    count
  }

  var i = 1L
  var tri = 1L
  breakable {
    while (true) {
      tri = triangle(i)
      val v = countDivisor(tri)
      println("i:" + i + " ,v:" +v)
      if(v >= 500) break
      i += 1
    }
  }
  println(tri)
}
