package wiley.accessmodifiers

class Access
{
  private var a:Int = 10
  def show():Unit ={
    println(a)
  }
  def set(a1:Int): Unit={
    a = a1;
  }
}
object accessmodifiers1 extends App{

  var p = new Access
  p.set(945)
  p.show()

}
