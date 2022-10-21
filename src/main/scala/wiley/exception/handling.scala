package wiley.exception

class handling {
  def divide(a: Int, b: Int): Unit = { //Exception occurs
    try
      {
        a/b
      }
      catch{
        case e:ArithmeticException =>println(e)
      }
    println("rest code is execute")
  }

}

object tr extends App{
  new handling().divide(200,0)

}
