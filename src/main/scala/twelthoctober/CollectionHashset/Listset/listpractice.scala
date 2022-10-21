package twelthoctober.CollectionHashset.Listset
//Listset maintain the order
import scala.collection.immutable._
object listpractice extends App {
  var listSet:ListSet[Int] =scala.collection.immutable.ListSet(2,3,89,26,78)
  listSet.foreach((elem:Int)=>println(elem))
println(listSet.isEmpty)
  listSet = scala.collection.immutable.ListSet.empty
  println(listSet.isEmpty)
}
