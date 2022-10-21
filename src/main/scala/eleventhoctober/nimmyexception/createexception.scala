/*package eleventhoctober.nimmyexception

import eleventhoctober.exceptionthrow.exceptionexampletest
class InvalidageException(s:String) extends Exception{
  override def toString: String = super.toString+"____"+s

}

class exceptiontest{
  @throws(classOf[InvalidageException])
  def validate(age: Int): Unit = {
    if(age<18){
      throw new InvalidageException("Not eligible")
    }else{
      println("you are eligible")
    }
  }
  }
object createexception extends App{
  var e = new exceptiontest()
  try{
    e.validate(4)
  }catch{
    case e: ArithmeticException=>println("Exception occured"+e)
  }


}*/
