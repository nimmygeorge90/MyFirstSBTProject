package eleventhoctober.breaktest

import scala.util.control.Breaks.{break,breakable}


object breaktest1 extends App{
  breakable{
    for(i<-1 to 10 by 2){
      if(i==7)
        break
      else
        println(i)
    }
  }

}