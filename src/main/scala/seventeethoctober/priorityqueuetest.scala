package seventeethoctober
import scala.collection.mutable.PriorityQueue
object priorityqueuetest extends App{

  case class Donut(name:String,price:Double)

    def donorder(d:Donut):Double=d.price
    var prir_queue:PriorityQueue[Donut]=PriorityQueue(
      Donut("plain donut",1.50),Donut("Strwberry",2),Donut("Choclate",3.20))(Ordering.by(donorder))
    println(  s"element of pq are $prir_queue")
    prir_queue.enqueue(Donut("creamy",7.90))
    prir_queue+=(Donut("creamy",7.9))

    var b:Donut = prir_queue.dequeue()
    println(b.name)



}
