package com.example

import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {

  it should "23 when 10" in {
    com.example.Problem1.sum35(10) should be (23)
  }
  it should "233168 when 1000" in {
    com.example.Problem1.sum35(1000) should be (233168)
  }

}
