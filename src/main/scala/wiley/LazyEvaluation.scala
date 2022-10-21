package wiley

//Lazy evaluation is the concept when we give keyword lazy while initializing the variable it does
//not produce o/p
object LazyEvaluation extends App {
  lazy val value = funct
  val settings: Boolean = true

  if (settings) {
    var temp = value
    println("Hai" + temp)
  }
  else {
    println("None")
  }


  def funct(): Unit = {
    println("Hello")
  }
}