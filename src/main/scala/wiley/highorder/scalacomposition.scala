package wiley.highorder

object scalacomposition {
  def main(args: Array[String]): Unit = {
    val output = mutiplyBy2(div(2))
    println(output)


  }

  def highorderfunction(a: Int, f: Int => AnyVal): Unit = {
    println(f(a))
  }

  def mutiplyBy2(a: Int): Int = {
    a * 2
  }

  def div(a: Int): Int = {
    a / 2
  }

}
