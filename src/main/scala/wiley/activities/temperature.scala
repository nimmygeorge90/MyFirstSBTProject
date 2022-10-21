package wiley.activities

//Write a Scala program to check whether one of the given temperatures is less than 0 and the other is greater than 100. 
object temperature extends App {

  def test(temp1: Double, temp2: Double): Boolean = {
    (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)
  }

  println("Enter the temperatures to check :")
  var temp1 = scala.io.StdIn.readDouble()
  var temp2 = scala.io.StdIn.readDouble()
  println("Result: " + test(temp1, temp2))
}




