package eighteenthoctober.tuple.regex

object regexpractice extends  App{
  val str = "Hello".r
  val str1 = "abc".r
  val source = "Hello everyone,Hello"
  println(str.findFirstIn(source))
  println(str1.findFirstIn(source))
  //it shows iteration of same number of words
  str.findAllMatchIn(source).foreach(x=>println(x))


  val needChange="repalcetest"
  val finalStr="replacetest".replaceAll(".test","**")
  println(needChange)
  println(finalStr)

  //anyhthing which ends with k
  val strcheck="check"
  val finaltempstr=strcheck.matches(".*k")
  println(finaltempstr)

  val sstr="something to test the result"
  var sfinalStr=sstr.split(".ng",2)
  for(sq<- sfinalStr) {
    println(s"here are teh array ${sq}")
  }

}
