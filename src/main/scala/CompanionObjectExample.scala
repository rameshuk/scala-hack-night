package main.scala

/**
  * Created by ramesh on 27/04/2016.
  */
object CompanionObjectExample extends App{

  println(Pizza.CRUST_TYPE_THIN)
  println(Pizza.getFoo)

  var p = new Pizza(Pizza.CRUST_TYPE_THICK)
  println(p)

}
// Pizza class
class Pizza (var crustType: String) {
  override def toString = "Crust type is " + crustType
}

// companion object
object Pizza {
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"
  def getFoo = "Foo"
}