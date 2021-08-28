object Q3 {
  import scala.io.StdIn.{readInt} // for get input

  def main(Args:Array[String]){
    print("Enter thr number: ")
    var i= readInt();
    Sum(i)
  }
  //function to return the addition of numbers from 1 to n
  def Sum(n:Int,i:Int=1,result:Int=0):Any ={
    if(n<1){
      println("n should be greater than 0")
    }
    else if(i<=n){
      return Sum(n,i+1,result+i)
    }
    else{
      println(result)
    }
  }
}
