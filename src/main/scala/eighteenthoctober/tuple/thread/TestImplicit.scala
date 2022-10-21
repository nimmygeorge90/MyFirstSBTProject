package eighteenthoctober.tuple.thread

object TestImplicit extends App{

  val value = 10

  implicit val multiplier =3

  def multiply(implicit by:Int): Int=value* by

  val result  = multiply

  println(result)

}
