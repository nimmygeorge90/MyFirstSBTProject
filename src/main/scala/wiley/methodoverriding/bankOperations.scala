package wiley.methodoverriding

//var cannot overright immutable variable
object bankOperations extends App {

  var ob1 = new bank
  ob1.interest()
  var ob2 = new barclays
  ob2.interest()
}

  class bank{
    private var centralbank:Int =1

    def interest(): Int = {
      centralbank
      // println("This Bank has an interest rate of centralbank"+centralbank)
    }
  }
  class barclays extends bank{
    val barclaysROI =2

    override def interest(): Int = {
      super.interest()+barclaysROI
  }

}
