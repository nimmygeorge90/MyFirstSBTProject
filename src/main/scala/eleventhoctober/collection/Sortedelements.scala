package eleventhoctober.collection

import scala.collection.immutable.SortedSet
object Sortedelements extends App{
  var num:SortedSet[Int] =SortedSet(3,1,5,7,4,8,7,4,3,0)
  num.foreach((eleme:Int)=>println(eleme))

}
