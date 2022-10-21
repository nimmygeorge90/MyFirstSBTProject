package wiley.pattern

import scala.collection.immutable._
object queuepractice extends App{
  var queue1 = Queue(2,33,24,21,6,22,121,90)
  var queue2:Queue[Int]=Queue(34,67,99,23,121,56,0,568,90,89)
  println(queue1)//printing queues
 println(queue2)

  //Getting first elemet
  val first =queue1.front
  println("First element:"+first)
  println("-------Enquing queue-------")
  var enq = queue1.enqueue(3)
  println("After enqueueing:")
  enq.foreach((element: Int)=> println(element+" "))
  println("----Dequeing Queue-----")
  var deq = enq.dequeue
  println(deq)
  println("-------Clean queue-------")
  //println("\nclear the queue: "+ queue2.clear)

}
