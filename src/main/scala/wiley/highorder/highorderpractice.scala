package wiley.highorder

//import
object highorderpractice {
  def main(args: Array[String]): Unit = {
   // val obj = com.wiley.scalafunctions.recursion.functionExample()
    highorderfunction(100, mutiplyBy2)
    highorderfunction(1500, div)
    //highorderfunction(2, obj)


  }
  def highorderfunction(a:Int,f:Int=>AnyVal):Unit={
    println(f(a))
  }
  def mutiplyBy2(a:Int):Int={
    a*2
  }
  def div(a:Int):Int ={
    a/2
  }
}

