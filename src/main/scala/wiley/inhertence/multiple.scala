package wiley.inhertence

trait Printable {
  def hello(): Unit = {
    println("Hello")
  }
}

trait Viewable {
  def hai(): Unit = {
    println("Hai")
  }
}

class inheritFromMore extends Printable with Viewable {
  def ever(): Unit = {
    println("hello everyone")
  }
}

object multipleInheritance extends App {
  var multi = new inheritFromMore
  multi.hello()
  multi.hai()
  multi.ever()
}
