package com.example

/**
  * Created by shigeru on 16/03/30.
  */
object Problem1 extends App {
  def sum35(n: Int) :Int =
    Range(1, n).filter(x => (x % 5) == 0 || (x % 3) == 0).sum

    println(sum35(10))
    println(sum35(1000))
}
