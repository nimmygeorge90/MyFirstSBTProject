package wiley.inhertence

class Parent_class{

  var sal = 1000
}
  class child_class1 extends Parent_class{
    var sal1 = 2000
  }

class child_class2 extends child_class1 {
  def show(): Unit ={
    println("Salary 1"+sal)
    println("Salary 2"+sal1)
  }
}
object multilevel extends App {

  var obj1 = new child_class2
  obj1.show()

}
