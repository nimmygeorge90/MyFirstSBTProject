package wiley.constructors

class primaryconstructor(i:Int,name:String) {
  def showDetails(): Unit = {
    println(i + " - " + name)
  }
}

object execPrimary extends App {
  new primaryconstructor(1,"Iza").showDetails()

}
