package com.example

/**
  * 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり,
  * これらの合計は 23 になる.
  * 同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.
  */
object Problem1 extends App {
  def sum35(n: Int) :Int =
    Range(1, n).filter(x => (x % 5) == 0 || (x % 3) == 0).sum

  println(sum35(10))
  println(sum35(1000))
}
