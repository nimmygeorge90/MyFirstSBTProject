package com.wiley.activities

import scala.collection.mutable.ListBuffer

object anagram extends App {
  var string:ListBuffer[String] = ListBuffer("eat","tea","tan","ate","nat","bat")
  var output:ListBuffer[ListBuffer[String]] = ListBuffer.fill(string.length)(ListBuffer())

  println(getOutput.filter(_.nonEmpty).mkString(", "))

  def getOutput: ListBuffer[ListBuffer[String]] = {
    var arr_count = 0

    for (str <- string) {
      if (!skip(str)) {
        for (x <- str.permutations) {
          if (string.contains(x) && !output(arr_count).contains(x)) {
            output(arr_count) += x
          }
        }
        arr_count += 1
      }
    }
    output
  }

  def skip(s:String): Boolean = {
    for (x <- output) {
      if (x.contains(s)) {
        return true
      }
    }
    false
  }

}

