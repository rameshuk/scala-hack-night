package main.scala

/**
  * Created by ramesh on 20/04/2016.
  */
object PatternMatching1 extends App{
  /**
    * write factorial function with help of pattern matching
    * fact function accepts x of type Int and returns an Int
    * refer to PatternMatching.java for more help
    *
    */

  def fact(x: Int): Int  = x match {
    case 0 => 1
    case _ => x * fact(x-1)

  }

  println(fact(6))
}
