object Q5 {
  import scala.io.StdIn.{readInt} // for get input
  def main(args: Array[String]): Unit = {
    print ("Enter the number: ")
    var n = readInt()
    evensum(n)

  }
  // function to check even numbers
  def iseven(x:Int):Boolean ={

      if(x%2==0){
        return true;

      }
      else{
        return false;

      }
  }
  //recursive function for get Sum of even numbers less than n
  def evensum(n:Int,i:Int=1,result:Int=0):Any = {
    if(n<1 || n==1){
      println( n + " should be greater than 1") //This will works,if user enter  zero or negative number
    }
    else if(i<n){
      if(iseven(i)){
        return evensum (n,i+1,result+i)
      }
      else{
        return evensum (n,i+1,result)
      }
    }
    else{
      println("Sum of Even numbers less than " + n +" : " + result)
    }
  }
}
