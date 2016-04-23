package com.example

import org.scalatest._

class Problem0006Spec extends FlatSpec with Matchers {

  it should "2640 when 10" in {
    com.example.Problem0006.result(10L) should be (2640L)
  }
  it should "25164150 when 100" in {
    com.example.Problem0006.result(100L) should be (25164150L)
  }

}
