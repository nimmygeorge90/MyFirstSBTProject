package twelthoctober.CollectionHashset.Patternmatching
class StudentTemp(roll:Int){
  var rollNumber=roll
}
class PeronalDetails(NameV:String,ageT:Int){
  var Name=NameV
  var age=ageT
}
object MatchNumbers extends  App{

  var st=new StudentTemp(1)
  var pt=new PeronalDetails("Iza",3)
  val studentRegster:Map[StudentTemp,PeronalDetails]= Map(st->pt)
  printingStatus(getStudentName(studentRegster,1))
  def getStudentName(studentRegster:Map[StudentTemp,PeronalDetails],roll:Int):Option[PeronalDetails]={
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
}










