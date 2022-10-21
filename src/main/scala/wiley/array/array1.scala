package wiley.array

class array1 {
  var arr = Array(1,2,3,4,5,6,7,8,9)
  var a2 = new Array[String](30)
  var a3:Array[String] =new Array[String](30)
  def show(): Unit ={
    for(a<- arr){
      println(a)
    }
    println("Third element:"+arr(2))
  }
  object array extends App{
    var arr1 =new array1
    arr1.show()
  }

}
