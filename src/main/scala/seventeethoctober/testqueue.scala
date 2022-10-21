package seventeethoctober

import scala.collection.immutable.Queue

class testqueue {
  var que = Queue(1, 2, 3, 4, 5, 6)
  var que1: Queue[Int] = Queue(10, 22, 33, 44, 55, 66, 77)

  def firstelemet(queue: Queue[Int]): Int = {
    val firstelemet = queue.front
    firstelemet
  }
    /*def firstelemetstring(queue: Queue[String]): String = {
      val firstelemet_str = queue.front
      firstelemet_str
    }*/


}
