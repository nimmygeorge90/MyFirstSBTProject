package twelthoctober.CollectionHashset.Collectionbitset
import scala.collection.immutable._

/*Bitset is a concept is allow only for positive integers and it is not allowed for negative integers
And Strings.And it also produce decreaseing order in the results.
A set is a collection which only contains unique items which are not repeatable.
A BitSet is a collection of small integers as the bits of a larger integer. Non negative integers
sets which represented as array of variable-size of bits packed into 64-bit words is called BitSets.
 */
object testbitset extends App{
  var number = BitSet(4,4,547,33,253,478,6779)
  number.foreach((element:Int)=>println(element))

}
