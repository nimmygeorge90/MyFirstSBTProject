package wiley.activities
import scala.io.StdIn.{readInt, readLine}

object factorial extends App{
  var f = 1
  def fact():(Unit)={
    println("Enter the number to find the factorial")
    var x = readInt()
    for(i<- 1 to x){
     f=f*i

    }
    println("Factorial of"+x+"is:"+f)
  }
  fact()

}
