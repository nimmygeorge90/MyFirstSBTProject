package wiley.fieldoverrding

class Vehicle {
  val speed:Int = 100

}

class Bike extends Vehicle
{
  override val speed = 100

  def show():Unit ={
    println(speed)

  }
}

object fieldoverriding extends App{
  var o1 = new Bike
  o1.show()

}
