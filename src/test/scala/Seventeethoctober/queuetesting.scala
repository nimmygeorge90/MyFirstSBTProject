package Seventeethoctober
import seventeethoctober.testqueue
import org.scalatest.funsuite.AnyFunSuite
import scala.collection.immutable.Queue
class queuetesting extends AnyFunSuite {
  test("Check queue front element") {
    val q = new testqueue
    val initial = Queue(1, 2, 3, 4, 6, 7)
    assert(q.firstelemet(initial) === 1)
  }
}
