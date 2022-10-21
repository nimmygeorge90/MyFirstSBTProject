package wiley.strings.stringinterpolation

object interpolationexample extends App{
  new interExample().show()

}

class interExample{
  var s1 = "Scala \nstring example"
  var version = 2.12
  def show(): Unit={
    println(f"This is $s1%s scala version is$version%2.2f")
  }
}
