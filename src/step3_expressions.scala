/**
  * “The smallest useful fragment of code in many programming languages
  * is either a statement or an expression. They’re different in a simple way.”
   statement: do not produce results, just changing state
   expressions: produce a result

   everything is Scala is an expression
  */

object step3_expressions extends App{
  val i = 3; val j = 2
  println(i + j)

  //multiline expressions
  // variable shadowing (some scoping)
  val z = {
    val i = 12
    val j = 15
    i + j
  }

  println(z)


}
/*
5
27
 */