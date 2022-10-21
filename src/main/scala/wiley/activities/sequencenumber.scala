package wiley.activities

//Create a Scala program to represent a List with a sequence of number from 100 to 150.
object sequencenumber extends App{
  var range = List.range(100,150,10)
  var ranasstring =range.mkString(", ")
  println("The sequence of number range between 100 AND 150 is:"+ranasstring)
  
}
