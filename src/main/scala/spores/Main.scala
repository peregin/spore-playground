package spores

import scala.spores._
import scala.pickling.Defaults._, scala.pickling.json._

/**
 * http://docs.scala-lang.org/sips/pending/spores.html
 */
object Main extends App {

  case class Person(name: String, age: Int)
  val outer1 = 0
  val outer2 = Person("Jim", 35)

  println("spore inner and outer classes")

  val s = spore {
    val factor = 1
    val inner = outer2
    (x: Int) => {
      x * factor
      s"The result is: ${x + outer2.age}"
    }
  }

  //val pkl = s.pickle
  //val person = pkl.unpickle[Person]
  //println(s"unpickled $person")
}
