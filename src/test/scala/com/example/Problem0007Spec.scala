package com.example

import org.scalatest._

class Problem0007Spec extends FlatSpec with Matchers {

  it should "13 when 6" in {
    com.example.Problem0007.generatePrimes(6).last should be (13)
  }
  it should "104743 when 10001" in {
    com.example.Problem0007.generatePrimes(10001).last should be (104743)
  }
}
