import org.scalatest._
import org.scalatest.funsuite._
import flatspec._
import matchers._

class CoreSuite extends AnyFlatSpec with should.Matchers {
  "sum" should "add one and two" in {
    Core.sum(1, 2) should be(3)
  }

  it should "work with negative numbers" in {
    Core.sum(-1, 2) should be(1)
  }
}

class CoreSuiteFun extends AnyFunSuite {
  test("a number multiplied by 0 is still 0") {
    assert(Core.mult(1, 0) == 0)
  }

  test("a number multiplied by -1 changes it sign") {
    assert(Core.mult(3, -1) == -3)
  }
}
