package main.scala

/**
  * Created by ramesh on 20/04/2016.
  */
object MultipleConstructors extends App{
  val p1: Person = new Person("John")
  System.out.println(p1.toString)
  val p2: Person = new Person("John", "paul")
  System.out.println(p2.toString)
  val p3: Person = new Person("John", "paul", 35)
  System.out.println(p3.toString)

  //write class Person with auxiliary constructors
}

class Person(var firstName: String, var lastName: String, var age : Int){

  def this(firstName: String) {
    this(firstName,"",0)
  }

  def this(firstName: String, lastName: String) {
    this(firstName,lastName,0)
  }


  override def toString = s"Person($firstName, $lastName, $age)"
}