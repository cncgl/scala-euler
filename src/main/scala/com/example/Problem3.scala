package com.example


object Problem3 extends App {
  def factor(n: Long, p: Long): List[Long] =
    if (n < p * p) List(n)
    else if (n % p == 0) p :: factor( n / p, p)
    else factor(n, p + 1)

  def factor(n: Long): List[Long] = factor(n, 2)

  val result = factor(600851475143L).last
  println(result)
}
