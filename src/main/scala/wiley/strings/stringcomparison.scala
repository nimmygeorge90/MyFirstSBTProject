package wiley.strings

//Compare each letter in 2 strings and results
//Each character
//Each character and space have number based the number the difference will change so it results
//Negative as well as positive
//It results 0 when both strings are same.

//substring is used when we doesn't need full elements
class stringcomparison {
  var s1 ="Scala String example"
  var s2 = "hello Scala"
  var s3 =" Hello Scala"
  var s4 =" Hello Scala"
  def show(): Unit ={
    println((s1).compareTo(s2))
    println((s2).compareTo(s3))
    println((s3).compareTo(s4))
    println(s1.substring(0,15))//Example of substring
  }

}

object compare extends App{
  new stringcomparison().show()

}