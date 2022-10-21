/*package eighteenthoctober.tuple.regex

import scala.util.matching.Regex

object numberingdigits extends App {
  val reg1 = new Regex("\\d")
  val str1 = "here the number is 230"
  println(reg1.findAllIn(str1).mkString(","))

  // if we use capital D then what  it would give you all non digits

  val reg2 = new Regex("\\D")
  val str2 = "to check digit 520 in string"
  println((reg2.findAllIn(str1).mkString(", ")))

  val reg4 = new Regex("\\S")
  //val str1="to check digit 520 in string"
  println((reg4.findAllIn(str1).mkString(", ")))


  val reg5 = new Regex("\\s")
  //val str1="to check digit 520 in string"
  println((reg5.findAllIn(str1).mkString(", ")))


  val reg6 = new Regex("q|r")
  val strtemp = "Check regular expression"
  println(reg6.findAllIn(strtemp).mkString("  , "))

  val reg7 = new Regex(".")
  val str8 = " checkf or new line"
  println(reg7.findAllIn(str8).mkString(" , "))

  val reg2 = new Regex("\\S")
  val str2 = "to check digit 520 in string"
  println((reg2.findAllIn(str1).mkString(", ")))

  val reg2 = new Regex("\\[0-9]")
  val str2 = "to check digit 520 in string"
  println((reg2.findAllIn(str1).mkString(", ")))

  }*/
