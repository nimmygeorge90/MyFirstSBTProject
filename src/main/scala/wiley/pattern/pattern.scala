package wiley.pattern

object pattern extends App{
  var a= 2
  a match {
    case 1=>println("sun")
    case 2 => println("moon")
    case _ => println("No")
  }

}
