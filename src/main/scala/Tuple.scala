package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object Tuple extends App{
  //write Tuple.java in scala using Tuples
  val b1 = ("The Hunger Games", 100.0)
  val b2 = ("The Giver", 80.0)
  val b3 = ("Divergent", 125.0)
  val b4 = ("Brave New World", 80.0)

  var listOfBooks = List(b1,b2,b3,b4)
  var maxBookPrice: (String, Double) = b1
  for (b <- listOfBooks) {
    if (b._2 > maxBookPrice._2) {
      maxBookPrice = b
    }
  }

 println(maxBookPrice)


}
