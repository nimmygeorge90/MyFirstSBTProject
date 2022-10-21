package seventeethoctober

import scala.collection.immutable.Stream.cons
object consstream extends App {
  val stream_cons:Stream[Int]= cons(1,cons(10,cons(100,Stream.empty)))
  println("Elements in stream with cons are:"+stream_cons)
  println("Filter the element more than 1000:" + stream_cons)
  println("Head of stream1:" + stream_cons.head)
  println("Mapping on stream:" + stream_cons.map {_ * 3})
  println("Maximum of stream:" + stream_cons.max)
  println("Minimum of stream:" + stream_cons.min)
  println("size of stream:" + stream_cons.size)
  println("Tail of stream:" + stream_cons.tail)
  println("First element:" + stream_cons(1))

}
