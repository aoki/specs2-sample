import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloSpecSpec extends Specification {
  "HelloSpecs" should {
    "1-3を計算することができる" in {
      HelloSpec.sushi(1, 3) must beEqualTo(-2)
    }
    "1-4を計算することができる" in {
      HelloSpec.sushi(1, 4) must beEqualTo(-3)
    }
  }
}
