package main.scala

/**
  * Created by ramesh on 20/04/2016.
  */

trait Vehicle {
  def name: String  = "Vehicle name is not defined..."
}

//class CaseClasses(override val name: String, wheels : Int) extends Vehicle{
//
//}

case class Car(wheels: Int) extends Vehicle {
 // name ="Car"
}