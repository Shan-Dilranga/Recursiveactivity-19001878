object Q2 {
  import scala.io.StdIn.{readInt} // for get input

  def main(Args: Array[String]) {

    print("Enter thr number: ")
    var i= readInt();
       PrimeSeq(i)
  }
  // function to choose given number is prime number or not
  def prime(i: Int, j:Int=2): Boolean = {

      if (i==j) {
         return true
      }
      else if (i<2||i%j==0) {
        return false
      }
      else{

        return prime(i, j+1)
      }


  }
  //Function to print all	prime number which less than n
    def PrimeSeq(n:Int,i:Int=2):Any={
        if(n<=2){
            println("There is no prime numbers less than "+ n)
            }
        else if(n!=i){
            if(prime(i)){
              print(i+ " ")
            }
            return PrimeSeq(n,i+1)
          }
        else  {

          print("are the prime numbers less than "+ n)
        }
   }

}
