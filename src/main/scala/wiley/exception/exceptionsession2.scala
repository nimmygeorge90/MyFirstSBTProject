package wiley.exception

//here throwable is the parent class of exception
//Here we give the arr(5) which is the exception which means the value of an array is out of bound.
//try/catch in Scala is an expression.
object sessexception extends App{
  new exceptionsession2().divide(200,10)

}
class exceptionsession2 {
  def divide(a:Int,b:Int): Unit={
    try{
      a/b
      var array =Array(1,2)
      array(5)
    }catch{
      case e:ArithmeticException =>println(e)
      case f:Throwable =>println(f)
    }
    println("The rest of code is executing")
  }

}
