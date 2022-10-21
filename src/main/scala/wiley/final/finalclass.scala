package com.wiley.finalpractice

class finalVehicle {
  final val somethingImmutable = "Unchanged"

  val speed = 60
  def show(): Unit = {
    println(speed)
  }
}

class finalBike extends finalVehicle {
  override val speed = 100

  override def show(): Unit = {
    println(speed)
  }

}

object finalDefinition extends App {
  var b = new finalBike
  b.show()
  var v = new finalVehicle
  v.show()
}