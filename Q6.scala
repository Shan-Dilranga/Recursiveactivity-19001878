object Q6 {
  import scala.io.StdIn.{readInt} // for get input
  def main(args: Array[String]): Unit = {
    print ("Enter the number: ")
    var n = readInt()
    Fibonacci(n)
  }
//function to return the fibonacci numbers for given n
  def Fibonacci(n:Int,i:Int=1,j:Int=0,k:Int=1):Any ={
    if(n<1){
      println("n should be greater than 0") //If user enter zero or negative number
    }
    else if(i>n){
       println()
     }
    else if(i==1){
       print("Fist " + n+ " fibonacci numbers : " +j + " ")
       Fibonacci(n,i+1,k,j+k)
     }
    else{
       print(j+ " ")
       Fibonacci(n,i+1,k,j+k)
     }
  }
}
