package wiley.pattern

object singleton extends App{
  single.add()
  single.add()
  single.add()
  single.add()


}

object single{
  var sum=0
  def add(): Unit = {
    sum = sum + 3
    println(sum)

  }
}
