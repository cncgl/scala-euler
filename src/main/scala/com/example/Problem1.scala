package com.example

/**
  * Created by shigeru on 16/03/30.
  */
object Problem1 {
  def main(args: Array[String]): Unit = {
    println(Range(1,10).filter(x => (x % 5 == 0)||(x % 3 == 0)).sum)
    println(Range(1,1000).filter(x => (x % 5 == 0)||(x % 3 == 0)).sum)
  }
}
