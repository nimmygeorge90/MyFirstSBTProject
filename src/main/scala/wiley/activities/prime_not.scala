package wiley.activities

object prime_not extends App{
def prime(num:Int) : Boolean= {
  for (i <- 2 until num) {
  if (num % i == 0) return false
  }
  return true
  }

  println("Enter the number to check weather it is prime or not")
  var num = scala.io.StdIn.readInt()
  if (prime(num))
    println("The given number is prime")
  else
    println("The number is not prime")
  }
