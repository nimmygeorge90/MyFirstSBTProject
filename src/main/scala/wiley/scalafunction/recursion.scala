package wiley.scalafunction

object recursion {
  def main(args: Array[String]): Unit ={
    var result =functionExample(18,3)
      println(result)
  }
  def functionExample(a:Int,b:Int):Int={
    if(b == 0)
      0
    else
      a+functionExample(a,b-1)
  }

}
