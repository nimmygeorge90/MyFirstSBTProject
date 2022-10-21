package wiley.anonymous

class ArithmeticOperations {
  def add(a: Int, b: Int): Unit ={

  var sum = a + b
  println("Sum:" + sum)
}

  def sub(a: Int, b: Int): Unit = {

    var sub = a - b
    println("Sub:" + sub)
  }

}
object Mainobject extends App{

  new ArithmeticOperations().add(7878,32)
  new ArithmeticOperations().sub(67,36)
}
