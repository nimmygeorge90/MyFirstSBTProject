package eleventhoctober.nimmyexception

class divideexception(x: String) extends Exception(x) {

}
class Exception_divide {
  @throws(classOf[divideexception])
  def div(num1: Int, num2: Int) {
    var result: Int = 0;
    if (num1 == 0) {
      throw new divideexception("Divide by 0")
    } else {
      result = (num2 / num1);
      printf("Result: %d\n", result);
    }
  }
}

object divideexception extends App{

    try {
      var obj = new Exception_divide();
      obj.div(0, 10);
    } catch {
      case e: divideexception => println(e);
    } finally {
      println("Finally block executed")
    }

}