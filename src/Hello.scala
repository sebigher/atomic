object Hello extends App {
  println("Hello, World!")

  //**// val: set once, unchanged forever
  val meal  = "burger"
  val fractional = 1.4
  val counter = 3
  println(meal, fractional, counter)

  //cannot change the val
 // meal = "hotdog" // compile error: reassignment to val

  /**
    * Scala is figuring the type for us: type inference
    */

  //data types
  println(5.4 + 9) // 14.4
  println(3.4 + "john") //3.4john
  //3 * "koko" //error ]

  //**// how to give the type to a val
  val n:Double  = 2 + 4
  println(n) //6.0

  // val m: Int = 2.3 + 4 // doesn't conform to expected type Int

  val m: Int = 2
  val fractionallica: Double = 3.4
  val boo: Boolean  = true
  val words: String = "A value"
  val lines: String =
    """
      How many times
      must a man walk his ways?
    """.stripMargin

  println(meal, fractional, boo, words)
  println(lines)

}

/**
  * Hello, World!
(burger,1.4,3)
14.4
3.4john
6.0
(burger,1.4,true,A value)

      How many times
      must a man walk his ways?


  */
