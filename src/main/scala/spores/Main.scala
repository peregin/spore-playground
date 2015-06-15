package spores

import scala.spores._

/**
 * Created by levi on 16/06/15.
 */
object Main extends App {

  case class Person(name: String, age: Int)
  val outer1 = 0
  val outer2 = Person("Jim", 35)

  val s = spore {
    val factor = 1
    val inner = outer2
    (x: Int) => {
      x * factor
      s"The result is: ${x + outer2.age}"
    }
  }

}
