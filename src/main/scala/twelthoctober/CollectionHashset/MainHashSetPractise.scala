package twelthoctober.CollectionHashset
import scala.collection.immutable.HashSet
object MainHashSetPractise extends App{
  var hashset: HashSet[String] = HashSet("3Pilaka Ruchitha",
    "4Sugandha Dhanawade",
    "6Irfan Khan Patan",
    "7Vaibhav Kemani",
    "8Sumukh Jadhav")
  hashset.foreach((element:String)=>{
    var string ="update temptable set name='"+element+"'where project'"
    println(string)
  })

}
