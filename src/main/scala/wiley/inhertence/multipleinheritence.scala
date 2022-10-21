package wiley.inhertence

trait Parent_class1{

  var sal = 1000
}
class child_class12 extends Parent_class1{
  var sal1 = 2000
}

class child_class22 extends child_class12 with Parent_class1 {
  def show(): Unit ={
    println("Salary 1"+sal)
    println("Salary 2"+sal1)
  }
}
object multipleinheritence extends App {

  var obj = new child_class22
  obj.show()

}

