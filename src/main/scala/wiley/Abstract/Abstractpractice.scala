package wiley.Abstract

// The thing which is don't want to show you can done using abstract class
abstract class car{
  def run()
}

class BMW extends car{
  override def run(): Unit ={
    println("The engine is fine")
  }
}

object Abstractpractice extends App{
var object1=new BMW
object1.run()
}
