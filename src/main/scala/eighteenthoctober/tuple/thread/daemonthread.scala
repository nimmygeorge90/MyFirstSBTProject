package eighteenthoctober.tuple.thread

class daemonthread extends Thread{
  override  def run(): Unit ={
    if(Thread.currentThread().isDaemon){
      println("daemon thread")
    }else{
      println("other work")
    }
  }
}
object testthreadutility extends App{
  var a= new daemonthread()
  var b= new daemonthread()
  var c= new daemonthread()
  a.setDaemon(true)

  b.start()
  c.start()
  a.start()

}
