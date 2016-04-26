package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object CaseClass extends App {

  case class Person(firstName: String, lastName: String)

  val me = Person("Ramesh", "Sukka")
  val first = me.firstName
  val last = me.lastName

  if (me == Person(first, last)) {
    println("Found match in case class!")
    println(me)
  }else {
    println("Not Found match in case class")
  }

  class AnotherPerson(firstName: String, lastName: String)


  val anotherPerson = new AnotherPerson("Ramesh", "Sukka")
 // val first = anotherPerson.firstName
//  val last = anotherPerson.lastName

  if (anotherPerson == new AnotherPerson("Ramesh", "Sukka")) {
    println("Found match in another class")
  } else {
    println("Not Found match in another class")
  }
}
