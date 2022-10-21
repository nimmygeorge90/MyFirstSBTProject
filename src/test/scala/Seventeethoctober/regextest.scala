package Seventeethoctober

import eighteenthoctober.tuple.regex.regexpractice.{source, str}
import org.scalatest.funsuite.AnyFunSuite

class regextest extends AnyFunSuite{
  test("Regex Check")
  val str1 = "abc".r
  val source = "Hello everyone"
  val result =(str.findFirstIn(source))
  assert(str.findFirstIn(source) "Hello everyone" === "Hello")

}
