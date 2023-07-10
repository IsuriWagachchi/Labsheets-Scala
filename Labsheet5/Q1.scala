package Labsheet5

import scala.io.StdIn

object Q1 {
  def main(args: Array[String]): Unit = {

    println("Enter value:")
    var m = StdIn.readInt()
    println(prime(m))


    def prime(n: Int, divisor: Int = 2): Boolean = {

      if (n <= 2)
        return n == 2

      if (n % divisor == 0)
        return false

      if (divisor * divisor > n)
        return true

      prime(n, divisor + 1)
    }


  }
}

