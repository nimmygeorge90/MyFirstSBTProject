package wiley

object scala_functions {

    def main(args: Array[String]): Unit = {
      var result = functionExamModify1()
      println(result)
      functionExample(10,20)
      functionExample1(100,20)

    }

    def functionExam(): Unit = {
      println("Simple func")
    }

    def functionExamModify1(): Any = {

      var a = 10
      a
    }
  //Parameterized
  def functionExample(a:Int,b:Int): Unit ={
    var c = a+b
    println(c)
  }

  def functionExample1(a: Int, b: Int)= {
    var c = a + b
    println(c)
  }

  def functionExample(a: Int): Int = {
    if (a == 1) {
      return 1
    }
    else {
      a * functionExample(a - 1)
    }
  }


}

