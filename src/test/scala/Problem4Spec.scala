import org.scalatest._

class Problem4Spec extends FlatSpec with Matchers {

  it should "9009 when 10^2" in {
    com.example.Problem4.maxPalindrome(1) should be (9009)
  }
  it should "906609 when 10^3" in {
    com.example.Problem4.maxPalindrome(2) should be (906609
    )
  }
}
