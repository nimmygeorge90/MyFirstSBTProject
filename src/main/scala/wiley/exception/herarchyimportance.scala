package wiley.exception

//here arithmetic exception is executed instead of trowable
class herarchyimportance {
  def divide(a: Int, b: Int): Unit = {
    try {
      a / b
      var array1 = Array(1, 2)
      array1(5)
    } catch {
      case parent: Throwable => println("unknown" + parent)
      case exce: Exception => println("Exception catch" + exce)
      case e: ArithmeticException => println(e)
    }
    finally { //here finally is used it will execute even the exception is generate an error
      println("Finally always executed")
    }
    println("Done")
  }

}
object hierarchy extends App{
  new  session3exception().divide(100,0)

}
