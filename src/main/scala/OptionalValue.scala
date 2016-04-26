package main.scala

/**
  * Created by ramesh on 21/04/2016.
  */
object OptionalValue extends App{

  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
  println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
}
