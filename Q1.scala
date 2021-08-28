object Q1{
  import scala.io.StdIn.{readInt} // for get input

  def main(Args: Array[String]) {
    print("Enter thr number: ")
    var i= readInt();
    println(i + " - " + prime(i))


  }
// function to check prime numbers
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

}
