package main.scala

/**
  * Created by ramesh on 27/04/2016.
  */
object MapTest extends App {

  var mapaValue = Map(1 -> 10, 2 -> 20, 3 -> 30)

  println(mapaValue map { t => val (key, value) = t; (key, value + 1) })
  println(mapaValue map { t => val (key, value) = t; (key + 1, value + 1) })
  println(mapaValue map { t => val (key, value) = t; (key + 1, value) })
  println(mapaValue map { t => val (key, value) = t; (key) })
  println(mapaValue map { t => val (key, value) = t;
  {
    println(value)
    value
  }
  })

  println(mapaValue map { case(key, value) => (key + 1, value) })


}
