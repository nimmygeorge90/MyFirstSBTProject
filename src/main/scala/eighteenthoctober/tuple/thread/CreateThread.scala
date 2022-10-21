package eighteenthoctober.tuple.thread

class CreateThread extends Thread{
  override def run(): Unit = {
    println("Do parallel computation here" + Thread.currentThread().getName)
    Thread.sleep(2000)
    println("we are back " + Thread.currentThread().getName)
  }

}
object MainObject extends App{
  var t= new CreateThread()
  t.start()
  var t1= new CreateThread()
  t1.start()
  var t2= new CreateThread()
  t2.start()
  var t3= new CreateThread()
  t3.start()
}







