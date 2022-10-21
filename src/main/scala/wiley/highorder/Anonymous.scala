package wiley.highorder

object Anonymous extends App{

  var ano = (a:Int,b:Int)=> a+b
  println(ano(67,29))

  var ano1 = (_: Int)+( _: Int)
  println(ano(45,45))

}
