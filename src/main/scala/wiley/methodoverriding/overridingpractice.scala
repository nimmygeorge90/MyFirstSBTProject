package wiley.methodoverriding

//overriding is were we can give same name function in different class
object overridingpractice extends App {
  var ob1 = new mathematicaloperat()
  ob1.operations
  var ob2 = new mathesub()
  ob2.operations

}

class mathematicaloperat{
  def operations: Unit ={
    var a:Int =9
    var b:Int =10
    var sum = a+b
    println("Sum is :"+sum)

  }
}

class mathesub extends mathematicaloperat{
  override def operations: Unit = {
    var a: Int = 9
    var b: Int = 10
    var mul = a * b
    println("Multiplication is:" + mul)
  }

}
