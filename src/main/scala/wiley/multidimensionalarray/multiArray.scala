package wiley.multidimensionalarray

/*Multidimensional array is the method which is used for complex problems.
Multidimensional array is an array which store data in matrix form.
 We can create from two dimensional to three, four and many more dimensional array according to
 needs.
 Syntax:
 var arrayName = Array.ofDim[ArrayType](NoOfRows,NoOfColumns) or
var arrayName = Array(Array(element...), Array(element...), ...)
 */
object multiArray extends App{
  var o1 = new multiArrayone
  o1.show()

}
class multiArrayone {
  var arr1 = Array.ofDim[Int](n1=3,n2 =3)
  arr1(1)(1) = 15
  arr1(1)(0) = 10

  def show(): Unit ={
    for(i<-0 to arr1(0).length -1){
      for(j<-0 to arr1(1).length-1){
        print(" "+arr1(i)(j))
      }
      println("")

    }
    println("The third element is:"+arr1(1)(1))
  }

}
