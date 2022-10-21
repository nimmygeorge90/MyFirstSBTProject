package com.wiley.inhertence

object banking_interest extends App {
  var emp = new bonus()
  var total_income = emp.sal + emp.sal1
  println(s"Total income: $total_income")
}

class employee{

  var sal =1000
}
class bonus extends employee{
  var sal1 = 500

}



