package eighteenthoctober.tuple.date
import java.util.Date

class DateThreadUsingSleep extends Thread{
  override def run():Unit = {}
  while(true) {
    var d2 = new Date()
    print("\r "+d2)
    Thread.sleep(1000)
  }
}

object mainSleep extends App {
  var dateThread = new DateThreadUsingSleep
  dateThread.run()
}