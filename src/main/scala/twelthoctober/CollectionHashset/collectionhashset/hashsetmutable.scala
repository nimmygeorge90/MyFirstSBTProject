package twelthoctober.CollectionHashset.collectionhashset
import scala.collection.mutable
object hashsetmutable extends App{
  var hashSet: mutable.HashSet[String] = mutable.HashSet("1 Iza Dinu",
    "2 Iha Sajo",
    "3 Nimisha George",
    "4 Nithya Maria"
  )
  hashSet.foreach((element: String) => {
    val string = "ID: " + element.split(" ")(0) + "\nFirst name: " + element.split(" ")(1) + "\nLast name: " + element.split(" ")(2) + "\n"
    println(string)
  })

}

