import org.scalatest._

class Problem5Spec extends FlatSpec with Matchers {

  it should "2520 when 1 to 10" in {
    com.example.Problem5.lcmSeq(1L, 10L) should be (2520)
  }
  it should "232792560 when 1 to 20" in {
    com.example.Problem5.lcmSeq(1L, 20L) should be (232792560)
  }
}
