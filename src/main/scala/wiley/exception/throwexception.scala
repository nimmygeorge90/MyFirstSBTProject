package wiley.exception

//This is the concept where we can throw exception when needed.
//we create an exception object and then we throw it by using throw keyword.Syntax:
//throw new ArithmeticException
class throwexception {
  def identify(age:Int): Unit ={
    if(age<18)
      throw new ArithmeticException("You are not eligible")
    else
      println("You are eligible")
  }

}
object throwourselves extends App{
  new throwexception().identify(10)
}
