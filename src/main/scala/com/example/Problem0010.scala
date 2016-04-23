package com.example

import scala.util.control.Breaks.{break, breakable}

/**
  * 10以下の素数の和は 2 + 3 + 5 + 7 = 17 である.
  *
  * 200万以下の全ての素数の和を求めよ.
  */
object Problem0010 extends App {

  def sumPrimes(n: Long): Long = {
    val primes = scala.collection.mutable.ArrayBuffer(2)
    var i = 3
    var total = 2L
    while(i <= n) {
      breakable {
        for(p <- primes) {
          if( i % p == 0) break
        }
        primes += i
        total += i
      }
      i += 2
    }
    total
  }

  println(sumPrimes(7))
  println(sumPrimes(2000000))
}
