package wiley.activities

//Write a Scala program to get a number from the user and print whether it is positive or negative
object pos_neg extends App{
  println("Enter the number to check weather it is positive or negative")
  var num = scala.io.StdIn.readInt()
  if(num>0)
    println("The given number"+ num +"is positive")
  else
    println("The given number"+num+"is negative")



}
