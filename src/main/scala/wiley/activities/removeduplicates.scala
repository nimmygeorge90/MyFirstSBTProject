package wiley.activities

object removeduplicates extends App {
  var array1 = Array(1,2,1,1,1,2,3,4,2,3,4)
  def dist(list:Array[Int]):Array[Int]={
    list.distinct
  }
  def show(num: Array[Int]): Unit = {
    for (x <- num) {
      print(x+ " ")
    }
  }
 show(removeduplicates.dist(array1))
}
