//**//“Like a value, a variable holds a particular type of information.
// But with a variable, you are allowed to change the data that is stored”


object step2 extends App{
  var koko = "My name is Koko"
  println(koko)
  koko = "My name is Koko Bow"
  println(koko)

  var name: String = "My name is not Koko"
  println(name)

  //name = 1.3 // compilr error: doesn't conform with the expected type String
}

/*
My name is Koko
My name is Koko Bow
My name is not Koko
 */