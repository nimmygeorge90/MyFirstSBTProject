package twelthoctober.CollectionHashset.sequence

object sequence_practice extends App{
  var seq:Seq[Int]=Seq(23,5,9,12,3,9,28,3,4,1)
  seq.foreach((elem:Int)=>println(elem))
  println(seq(2))

  println(seq.isEmpty)
  println(seq.endsWith(Seq(3,4,1)))
  println(seq.contains(8))
  println(seq.lastIndexOf(1))
  println(seq.reverse)

}
