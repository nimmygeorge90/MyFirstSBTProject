package seventeethoctober

object moreonstream extends App {
  val stream = 1#:: 10#:: 100#:: 1000#:: 10000#:: Stream.empty
  println("Head of stream:"+stream.head)
  var stream1 =stream.filter(_>1000)
  println("Filter the element more than 1000:"+stream1)
  println("Head of stream1:"+stream1.head)
  println("Mapping on stream:"+stream.map{_*3})
  println("Maximum of stream:"+stream.max)
  println("Minimum of stream:"+stream.min)
  println("size of stream:"+stream.size)
  println("Tail of stream:"+stream.tail)
  println("First element:"+stream(1))
}
