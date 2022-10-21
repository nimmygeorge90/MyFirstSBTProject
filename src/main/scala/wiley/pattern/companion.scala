package wiley.pattern

class CompanionClass {
  def printSomething(): Unit = {
    println("Companion Class")
  }
}

object CompanionObject extends App {
  new CompanionClass().printSomething()
  println("Companion Object")
}