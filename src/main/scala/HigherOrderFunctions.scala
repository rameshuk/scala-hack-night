package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object HigherOrderFunctions extends App {

  //sum of ints
  def sumInt(a: Int, b: Int): Int = {
    var s = 0
    for (i <- a to b)
      s += i
    s
  }

  //finding cube of number
  def cube(x: Int): Int = x * x * x

  //sum of cubes from a to b
  def sumCubes(a: Int, b: Int): Int = {
    var s = 0
    for (i <- a to b)
      s += cube(i)
    s
  }


  def sum(f: Int => Int, a: Int, b: Int): Int = {
    var s = 0
    for (i <- a to b)
      s += f(i)
    s
  }

  println(sumInt(5,10))
  println(sumCubes(5,10))
  println(sum((x) =>x ,5,10))
  println(sum((x) =>cube(x) ,5,10))
}
