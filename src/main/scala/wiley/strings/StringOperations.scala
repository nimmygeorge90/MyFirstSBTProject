package wiley.strings

object Stringactions extends App{
  new StringOperations().output()

}


class StringOperations {
var s1 ="Hello Everyone"
  var s2 ="Hello Scala"
  var s3 ="Hello Scala"
  var s4 ="Hello" + "Scala"//Sting Concatination
  var s5 ="Hello" + " Scala"//Sting Concatination
  var s6="Hello" + "scala"//Sting Concatination
  var s7 = "Hello"
  var s8 ="Scala"

  var s9 = (s7.concat(s8))
  def output(): Unit ={
    println(s1.equals(s2))//String Comparison
    println(s2.equals(s3))
    println(s2.equals(s4))
    println(s2.equals(s5))
    println(s2.equals(s6))
    println(s2.equals(s9))
  }
}
