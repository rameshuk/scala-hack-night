package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object PatternMatching extends App{

 var x = Seq(1, 2, 2.7, "one", "two", 'four)

 /**
   * The x is of type Any.

   * Match if x equals 1.

   * Match any other Int value. Safely cast the value of x to an Int and assign to i.

   * Match any Double, where the value of x is assigned to the Double variable d.

   * Match the String “one”.

   * Match any other String, where the value of x is assigned to the String variable s.

   * Match all other inputs, where unexpected is the variable to which the value of x is assigned. Because no type annotation is given, Any is inferred. This functions as the “default” clause.

   * Print the returned String.

   * int 1
   * other int: 2
   * a double 2.7
   * string one
   * other string: two
   * unexpected value: 'four
   **/


}
