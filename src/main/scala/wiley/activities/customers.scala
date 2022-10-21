package wiley.activities

/*Create a Scala program to prompt customers for their name and age. The format for the name and age labels
 should be in bold. And, the name literal should be underlined.
Output:
Name: Nadim Bahadoor
Age: 38*/

import scala.io.StdIn._
object customers extends App{
  println("Enter your name: ")
val name = readLine ()
  println("Enter your age: ")
val age = readInt()
println (Console.BOLD)
print ("Name: "+Console.UNDERLINED)
//print (Console.UNDERLINED)
print (name)
//println (Console.BOLD)
println("Age: "+Console.BOLD)
print (Console.RESET)
print (age)

}
