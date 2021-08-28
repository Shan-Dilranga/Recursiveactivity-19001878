object  Q4 {
  import scala.io.StdIn.{readInt}

  def main(Args:Array[String]){
  //Check whether given number is odd or even(Q4)
  print("Enter thr number: ")
  var x= readInt();
  isodd(x)


}
    def iseven(x:Int):Boolean ={

        if(x%2==0){
          return true;

        }
        else{
          return false;

        }
    }
    def isodd(x:Int): Any = {
        if (!iseven(x)) {

          println( x + " is odd number")
        }
        else {
          println(x + " is an even number")
        }

    }
}
