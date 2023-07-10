package Labsheet5

import scala.io.StdIn

object Q3 {
  def main(args: Array[String]): Unit = {

    println("Enter value:")
    var n = StdIn.readInt()
    println("The sum is :" + sum(n))

  }
    def sum(n: Int, m: Int = 1): Int = {

      if (n >= m)
        n+sum(n-1,m)

      else
        return 0;





  }
}

