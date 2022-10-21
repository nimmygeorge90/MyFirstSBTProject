package eighteenthoctober.tuple.thread


//In scala priority setting of main thread is 5.Thread cannot be ensure that it run based on what we given.

  object prioritysetting extends App {
    var t = new CreateThread()
    var t1 = new CreateThread()
    var t2 = new CreateThread()
    var t3 = new CreateThread()

    //println(Thread.currentThread().getPriority)
    t.start()
    t1.start()
    t2.start()
    t3.start()

    t.setPriority(2)
    t1.setPriority(3)
    t2.setPriority(4)
    t3.setPriority(5)
  }
