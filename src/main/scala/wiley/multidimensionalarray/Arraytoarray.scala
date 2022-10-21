package wiley.multidimensionalarray

object Arraytoarray extends App {
  var o1 = new Arrayto
  o1.show()

}
class Arrayto {
 /* var arr1 = Array.ofDim[Int](n1=3,n2 =3)
  arr1(1)(1) = 15
  arr1(1)(0) = 10*/
  var arr1 = Array(Array(1,3,5,7,9),Array(2,4,6,8,10))

  def show(): Unit ={
    for(i<-0 to 1){
      for(j<-0 to arr1(1).length-1){
        print(" "+arr1(i)(j))
      }
      println("")

    }
    println("The third element is:"+arr1(1)(1))
  }

}

