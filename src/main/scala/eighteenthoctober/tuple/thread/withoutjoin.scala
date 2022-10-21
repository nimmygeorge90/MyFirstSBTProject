package eighteenthoctober.tuple.thread

class withoutjoin extends Thread{

    override  def run(): Unit ={
      try{
        Thread.sleep(3000)
        println("Do parallel computation here"+Thread.currentThread().getName)
        Thread.sleep(2000)
        println("we are back "+Thread.currentThread().getName)
      }catch{
        case e:Exception=> e.printStackTrace()
      }

    }

  }
  object withoutjoin extends App{
    var t= new withoutjoin()
    var t1= new withoutjoin()
    var t2= new withoutjoin()
    var t3= new withoutjoin()
    //Here we are using join  to order the threads,

    t.start()
    //t.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)

    }catch{
      case e:Exception=> e.printStackTrace()
    }
    t1.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)

    }catch{
      case e:Exception=> e.printStackTrace()
    }

    t2.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)

    }catch{
      case e:Exception=> e.printStackTrace()
    }

    t3.start()
    try {
      println("the current thread name is " + Thread.currentThread().getName)

    } catch {
      case e: Exception => e.printStackTrace()
    }


  }
