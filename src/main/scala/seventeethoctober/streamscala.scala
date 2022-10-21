package seventeethoctober
/*The Stream is a lazy lists where elements are evaluated only when they are needed. This is a
 scala feature. Scala supports lazy computation. It increases performance of our program. Streams
 have the same performance characteristics as lists.
Stream can be constructed with the #:: operator method, using Stream.empty at the end of the
 expression.Syntax:
 val str = 1 #:: 2 #:: 3 #:: Stream.empty

 */
object streamscala extends App{
  val stream = 1 #:: 2#:: 3 #:: 8#:: 20#:: Stream.empty
  println(stream)

  println("Take first 2 element from stream")
  stream.take(2).print()
  println("")

  stream.take(4).print()
  println(stream.map(_+5))
  // Creating empty stream
  val emptyStream: Stream[Int] = Stream.empty[Int]
  println(s"Empty Stream = $emptyStream")

}
