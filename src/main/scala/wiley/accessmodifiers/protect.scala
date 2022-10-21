package wiley.accessmodifiers

//private cannot access to any class .
// protected is access to all class,sub class and companion class
class access_protect{
  protected var a:Int=10

}
class tempprotect extends access_protect{
  def display():Unit ={
    println(a)
  }
}

object protect extends App{
  var s = new tempprotect
  s.display()

}
