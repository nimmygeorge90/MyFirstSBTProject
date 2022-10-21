package eighteenthoctober.tuple.thread

class workingwithjoin extends Thread{
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
  object withjoin extends App{
    var t= new workingwithjoin()
    var t1= new workingwithjoin()
    var t2= new workingwithjoin()
    var t3= new workingwithjoin()
//Here we are using join  to order the threads, 

    t.start()
    //t.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)
      t.join()
    }catch{
      case e:Exception=> e.printStackTrace()
    }
    t1.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)
      t1.join()
    }catch{
      case e:Exception=> e.printStackTrace()
    }

    t2.start()
    try{
      println("the current thread name is "+Thread.currentThread().getName)
      t2.join()
    }catch{
      case e:Exception=> e.printStackTrace()
    }

    t3.start()
    try {
      println("the current thread name is " + Thread.currentThread().getName)
      t2.join()
    } catch {
      case e: Exception => e.printStackTrace()
    }


  }