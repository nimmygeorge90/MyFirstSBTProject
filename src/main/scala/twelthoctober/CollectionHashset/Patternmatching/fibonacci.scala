package twelthoctober.CollectionHashset.Patternmatching

class fibonacci {
  def fibo(n: Int): Int = {
    var a = 0
    var b = 1
    for (i <- 0 to n) {
      var temp = a
      a = b
      b = temp + b
    }
    a
  }

}
object fibon extends App{
  var ob = new fibonacci()
  println(ob.fibo(9))
}
