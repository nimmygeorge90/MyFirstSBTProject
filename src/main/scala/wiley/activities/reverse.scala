package wiley.activities

//Write a Scala program to reverse all the digits of numbers.
object reverse extends App {
  println("Enter the number to reverse:")
  var num = scala.io.StdIn.readInt()
    var rev_num: Int = 0
    while (num > 0) {
      rev_num = rev_num * 10 + num % 10;
      num = num / 10;
    }
      println("The reverse number is:" + rev_num)
}


