package wiley.mixtraits

trait Print{
  def print()
}
abstract class printA4{
  def printA4()
}
class A6 extends printA4 with Print{
  override def print(): Unit ={
    println("Print Sheet")
  }

  override def printA4(): Unit = {
    println("Print A4 Sheet")
  }
}

object mixtraits extends App {

  var ob1 = new A6
  ob1.print()
  ob1.printA4()

}
