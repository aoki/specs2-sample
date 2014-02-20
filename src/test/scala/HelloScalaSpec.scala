import org.specs2.mutable.Specification

import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class HelloScalaSpec extends Specification {
  "HelloScala" should {
    "1+3を計算することができる" in {
      HelloScala.add(1, 3) must beEqualTo(4)
    }
    "1+4を計算することができる" in {
      HelloScala.add(1, 4) must beEqualTo(5)
    }
  }

  "HelloScala2" should {
    "1+3を計算することができる" in {
      HelloScala.add(1, 3) must beEqualTo(4)
    }
    "1+4を計算することができる" in {
      HelloScala.add(1, 4) must beEqualTo(5)
    }
  }
}
