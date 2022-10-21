package eleventhoctober.breaktest.exceptionthrow

class exceptionexampletestclass {
  @throws(classOf[NumberFormatException])
  def validate():Int ={
    "abc".toInt
  }
}
object exceptionexampletest extends App{
  var ob = new exceptionexampletestclass()
  try{
    ob.validate
  }catch{
    case ex:NumberFormatException=>println("Number format issue")
  }
  println("The code is executing")
}
