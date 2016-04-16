package com.example

import org.scalatest._


class Problem3Spec extends FlatSpec with Matchers {

  it should "6857 when 600851475143L" in {
    com.example.Problem3.factor(600851475143L).last should be (6857)
  }

}
