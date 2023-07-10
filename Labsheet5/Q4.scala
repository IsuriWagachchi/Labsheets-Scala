package Labsheet5

import scala.io.StdIn

object Q4 {

  def isOdd(i: Int): String = i match{
    case 0 => "Number is Odd"
    case _ => isEven(i - 1)
  }

  def isEven(i: Int): String=i match{
    case 0=>"Number is Even"
    case _ => isOdd(i - 1)

  }

  def main(args: Array[String]): Unit = {

    println("Enter value:")
    var n = StdIn.readInt()
    println(isEven(n))

  }
}
