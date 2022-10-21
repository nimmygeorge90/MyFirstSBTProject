package wiley.`trait`

trait Printable {
    def Print()
  }

  class A4 extends Printable {
    override def Print(): Unit = {
      println("Its an a4 page")
    }
  }

  object trait1 extends App {
    var a: Printable = new A4()
    a.Print()
  }


