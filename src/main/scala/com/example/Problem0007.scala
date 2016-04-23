package com.example

import scala.util.control.Breaks
/**
  * 素数を小さい方から6つ並べると 2, 3, 5, 7, 11, 13 であり, 6番目の素数は 13 である.
  * 10 001 番目の素数を求めよ.
  */
object Problem0007 extends App {

  def from(n: Int): Stream[Int] = Stream.cons(n, from(n + 1))
  def sieve(xs: Stream[Int]): Stream[Int] =
    Stream.cons(xs.head, sieve(xs.tail.filter(_ % xs.head != 0)))
  def sieve2(xs: List[Long]): List[Long] =
    if (xs.isEmpty) Nil else xs.head :: sieve2(xs.tail.filter(_ % xs.head != 0))
  def primes = sieve(from(2))
  def primes2(n: Long) = sieve2((2L to n).toList)

  def generatePrimes(n: Int): List[Int] = {
    val primes = scala.collection.mutable.ArrayBuffer(2)
    var i = 3
    val b = new Breaks
    while(primes.length < n) {
      b.breakable {
        for (p <- primes) {
          if (i % p == 0) b.break
        }
        primes += i
      }
      i += 2
    }
    primes.toList
  }

  println(generatePrimes(6).last)
  println(generatePrimes(10001).last)
}
