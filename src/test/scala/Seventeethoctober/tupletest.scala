package Seventeethoctober

import org.scalatest.funsuite.AnyFunSuite


class tupletest extends AnyFunSuite {

  test("Type check") {
    println(eighteenthoctober.tuple.tuplepractice.tuple1)
    assert(eighteenthoctober.tuple.tuplepractice.tuple1.isInstanceOf[Int] === true)
  }

  test("Tuple contains test") {
    assert(eighteenthoctober.tuple.tuplepractice.tuple2._1 === "Apple")
  }

  test("To string test") {
    assert(eighteenthoctober.tuple.tuplepractice.tuple3._2.toString === "1.2")
  }
  test("Size test") {
    assert(eighteenthoctober.tuple.tuplepractice.tuple3._2.toString === "1.2")

    /* test("size") {
      val q = new tupletest
      val initial = (1, 2, 3, 4, 6, 7)
      assert(q.(eighteenthoctober.tuple.tuplepractice.sizecheck)(initial) === 6)
    }*/

  }
}