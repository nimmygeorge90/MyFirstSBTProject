package twentythoctober
import scala.util.{Failure, Success, Try}
class methodwhichthrowexception {
  object Utility extends App{
    def methodWhichCanThrowException():String = throw new RuntimeException()

    val handleExceptionorString=Try(methodWhichCanThrowException())

    val anotherStringProcess= handleExceptionorString match {
      case Success(value)=> s"i have optained a valid value:${value}"
      case Failure(exception)=> "I have obtained failure"

    }
    println(anotherStringProcess)


  }
}
