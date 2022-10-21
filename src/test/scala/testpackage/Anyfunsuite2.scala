package testpackage

import org.scalatest.funsuite.AnyFunSuite
import fourteenthoctober.testcase.ScalaCollection
import scala.collection.mutable

class Anyfunsuite2 extends AnyFunSuite{

  test("pop is invoked on non empty stack"){

    assert(ScalaCollection.result === 21)
    assert(ScalaCollection.stack.size === ScalaCollection.oldsize-1)
  }
  test("pop is invoked on an empty stack"){
    val emptyStack=new mutable.Stack[Int]
    intercept[NoSuchElementException]{
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("testing index out of bound"){
    val s="hi"
    intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
  }

  test("Testing indexoutofbound with message"){
    val s="hi"
    val thrown=intercept[IndexOutOfBoundsException]{
      s.charAt(-1)
    }
    //  println()
    assert(thrown.getMessage === "Index -1 out of bounds for length 2")
  }

}
