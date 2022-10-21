package wiley.scalafunction

object default {
  def main(args: Array[String]): Unit ={
    val res = functionExample(7,9)
    val res2 = functionExample()
    val res3 = functionExample(56)
    println(res)
    println(res2)
    println(res3)

  }

  def functionExample(a:Int=0,b:Int=0):Int={
    a+b
  }

}
