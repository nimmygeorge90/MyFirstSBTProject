package wiley.exception

//Finally will be always executed not matter if an exception is thrown or not.
//Here exception is done by the case exce
class session3exception {
  def divide(a: Int, b: Int): Unit = {
    try {
      a / b
      var array1 = Array(1, 2)
      array1(5)
    } catch {
      case e: ArithmeticException => println(e)
      case exce: Exception => println("Exception catch" + exce)
      case parent: Throwable => println("unknown" + parent)
    }
    finally {//here finally is used it will execute even the exception is generate an error
      println("Finally always executed")
    }
    println("Done")
  }
}

object exception3 extends App{
  new  session3exception().divide(100,10)



}
