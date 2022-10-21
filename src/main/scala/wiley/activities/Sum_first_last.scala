/*package com.wiley.activities
//Write a Scala program to find the sum of the first and last digit of a number.
object Sum_first_last extends App {
  println("Enter the number:")
  var num=scala.io.StdIn.readInt()
  def first_digit(num:Int): Unit ={
    var number = {
      var a = Math.log10(number).intValue()
      Math.pow(10, a).intValue()
    }

    var firstDigit = num / number
    println(firstDigit)
    var lastDigit = number % 10
    println(lastDigit)
    }
  }
*/

