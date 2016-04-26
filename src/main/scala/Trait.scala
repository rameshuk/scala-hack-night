package main.scala

/**
  * Created by ramesh on 26/04/2016.
  */
object Trait extends App{
  //programming for interfaces not implementation
  var shape: Shape = new Circle(10)

  shape.draw()
  System.out.println("Area="+shape.getArea())

  //switching from one implementation to another easily
  shape=new Rectangle(10,10)
  shape.draw()
  System.out.println("Area="+shape.getArea())

}
trait Shape {

  var LABLE: String = "Shape"

  def draw(): Unit

  def getArea(): Double = 0
}

class Circle(r: Double) extends Shape {

  var radius: Double = r

  override def draw() {
    println("Drawing Circle")
  }

  override def getArea(): Double = Math.PI * this.radius * this.radius
}

class Rectangle(w: Double, h: Double) extends Shape {

  var width: Double = w

  var height: Double = h

  override def draw() {
    println("Drawing Rectangle")
  }

  override def getArea(): Double = this.height * this.width
}