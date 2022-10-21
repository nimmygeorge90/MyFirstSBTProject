package eleventhoctober.breaktest.activities

abstract class Donut_Pastry() {
  val name: String

  def printName(): Unit = {
    println("Name is" + name)
  }
}
class VanillaDonut extends Donut_Pastry {
  override val name: String = "VanillaDonut"
  //override printName()
}
class GlazedDonut extends Donut_Pastry {
   override val name: String = "GlazedDonut"
  //override printName()
}
object pastry extends App{
  var object1=new GlazedDonut
  object1.printName()
  var object2 = new VanillaDonut
  object2.printName()
}



