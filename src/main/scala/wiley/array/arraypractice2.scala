package wiley.array

class ArrayExampl{
  var arr = new Array[String](5)
  def show():Unit ={
    for(a<- arr){
      println(a)
    }
    println(arr(2))
    arr(2)="Nimmy"
    println(arr(2))
  }
}

object arraypractice2 extends App{
  var a = new ArrayExampl
  a.show()


}
