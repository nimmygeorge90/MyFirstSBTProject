package wiley.exception

/*Exception handling used to handle abnormal conditions and also avoid termination of program
unexceptedly.
below program when any number divide by 0 is infinite so the exception occurs due to envt law.
 exception is removed from try catch method

 */
object checkexception extends App{
  new exceptionexamplpe().divide(200,0)
}
class exceptionexamplpe {
  def divide(a:Int,b:Int): Unit={//Exception occurs
    var div = a/b
    println("divide:"+div)
  }

}
