package wiley.overloadingmethod

//Here implementing different method has same number of parameter and different data types
class overload2 {
  def operations(a: Int, b: Int,c:Int): Unit = {
    var quadratic = (b * b) - (4 * a * c)
    println("The result of given quadratic equation is:" + quadratic)

  }

  def mathematicaloperations(a: Int, b: Int): Unit = {
    var add = a + b
    println("Sum of number is :" + add)
  }

}

object Overobj extends App {
  var obj = new computations()
  obj.mathematicaloperations(3, 7, 7)
  obj.mathematicaloperations(5, 66)




}
