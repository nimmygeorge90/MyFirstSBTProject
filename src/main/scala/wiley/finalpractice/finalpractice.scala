package wiley.finalpractice

//If we add final then it will not override any variable and method, which is same as constant.
object finalpractice extends App{
  var final1 = new car
 final1.show()
  var final2 = new BMW
  final2.show()

}

class car {
  final val speed: Int = 100

  def show(): Unit = {
    println("The speed is:" + speed)
  }
}
class BMW extends car{
 // val speed:Int=120//here when we add speed it shows error message due to speed is final keyword
  override def show(): Unit = {
    println("The speed is:" + speed)
  }

}

