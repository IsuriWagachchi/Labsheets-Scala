package Labsheet5

import scala.io.StdIn

object Q5 {

  def sumEVE(n: Int): Int=n match {
    case n if n <=0 =>0
    case n if n%2 ==0 =>n+ sumEVE(n-2)
    case n =>sumEVE(n-1)

  }

  def main(args: Array[String]): Unit = {

    println("Enter value:")
    var n = StdIn.readInt()
    println("The num of all even is:"+sumEVE(n))

  }
}
