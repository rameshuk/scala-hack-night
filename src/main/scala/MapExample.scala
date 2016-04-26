package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object MapExample extends App{
  val mapValues = Map(1 -> "Red", 2 -> "Green",3 -> "Orange", 4 -> "Red",5-> "Blue", 6 -> "Green", 7 -> "While")
  System.out.println(mapValues)
//Map(5 -> Blue, 1 -> Red, 6 -> Green, 2 -> Green, 7 -> While, 3 -> Orange, 4 -> Red)
// Map(Red -> List(1, 4), Blue -> List(5), Green -> List(6, 2), While -> List(7), Orange -> List(3))

  var m  = Map(1->1,2->2,3->3)

  println(m.map({ t =>
    val (s, i) = t;
    (s, i + 1)

  }))




}


