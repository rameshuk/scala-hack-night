package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object Closure extends App {
  var incrementer = 10

  def closure = {
    x: Int => x + incrementer
  }

  val result1 = closure(10)
  println(result1)

  incrementer = 20
  val result2 = closure(10)
  println(result2)

}
