package twelthoctober.CollectionHashset.Collectionbitset
import scala.collection.immutable.BitSet

object AddingRemovingBitset extends App {
  var num = BitSet(1, 5, 8, 7, 91, 238, 328)
  num.foreach((element: Int) => println(element))
  num += 20
  println("After adding 20")
  num.foreach((element: Int) => println(element))
  num -= 8
  println("After deleting 8")
  num.foreach((element: Int) => println(element))
}

