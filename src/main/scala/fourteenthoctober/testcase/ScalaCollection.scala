package fourteenthoctober.testcase

import scala.collection.mutable
object ScalaCollection {
  var stack = new mutable.Stack[Int]
  stack.push(1)
  stack.push(2)
  val oldsize=stack.size
  val result=stack.pop()

}
