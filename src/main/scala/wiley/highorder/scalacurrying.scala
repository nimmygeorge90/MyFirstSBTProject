package com.wiley.highorder
//scala
object scalacurrying extends App{
  val result = add(10)(20)
  println(result)
  val half = add(50) _
  println(half)
  val result2 = half(30)
  println(result2)

  def add(a: Int)(b: Int): Int = {
    a + b
  }

}


