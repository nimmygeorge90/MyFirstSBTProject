/*package twelthoctober.CollectionHashset.Patternmatching

class patternmatchingthird {

  class Employee(id:Int){
    var id_no=id
  }
  class Peronal(Name:String,age:Int){
    var Name=Name
    var age=age
  }
  object matchingstatus extends  App{

    var emp=new Employee(1)
    var per=new Peronal("Iza",3)
    val Emp_register:Map[StudentTemp,PeronalDetails]= Map(emp->per)
    printingStatus(get(Emp_register,1))
    def get(studentRegster:Map[StudentTemp,PeronalDetails],roll:Int):Option[PeronalDetails]={
      var alpha:Option[PeronalDetails]=None
      var studentKeys=studentRegster.keys
      var check=false
      for(a <- studentKeys){
        if(a.rollNumber.equals(roll)){
          alpha=studentRegster.get(a)
          check=true
        }

      }
      if(!check){
        var pt1:Option[PeronalDetails]=None
        pt1

      }else{
        alpha
      }
    }
    def printingStatus(student:Option[PeronalDetails]):Unit={
      student match {
        case student => println("One"+student)
        case None => println("No")
      }
    }
  }*/











