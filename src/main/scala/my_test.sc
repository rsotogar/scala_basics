// for and while loops

for (x <- 0 until 10){
  println(x)
}

var i = 0
while (i <= 100) {
  println(i)
  i += 10
}

var secuencia = List(1,2,3,4)

for (i <- secuencia) {
  println(s"El valor es : $i")
}


// functions

def print_name(name: String, surname: String): Unit = {
  println(s"My name is $name $surname")
}

print_name(name = "Ramon", surname = "Soto")


def triplica(valor: Int): Int = {
  val valor_final = valor * 3
  valor_final
}

var l = List(1,2,3,4)

println(l.map(x => triplica(x)))

def multiplica_valores(valores: Int*): Int = {
  var resultado = 1
  for (valor <- valores){
    resultado *= valor
  }
  resultado
}

multiplica_valores(1,2,3)

// objects, traits and classes

trait vehiculo
case class coche(make: String, model: String, horsepower: Int, num_ruedas: Int = 4) extends vehiculo
case class moto(make: String, model: String, horsepower: Int, num_ruedas: Int = 2) extends vehiculo

var ducati_monster = moto(make = "ducati", model = "monster", horsepower = 70)


def match_case(param: vehiculo): Unit = param match {
  case moto(make, model, horsepower, num_ruedas) => println(s"Es una moto y tiene $num_ruedas ruedas")
  case coche(make, model, horsepower, num_ruedas) => println(s"Es un coche y tiene $num_ruedas ruedas")
}


println(match_case(ducati_monster))


class Point(xc: Int, yc: Int) {
  override def toString: String = s"Punto ($xc, $yc)"

  def move(dx: Int, dy: Int): Unit = {
    val x: Int = xc + dx
    val y: Int = yc + dy
    println ("Point x location : " + x)
    println ("Point y location : " + y)
  }
}

var punto_a = new Point(3,4)

println(punto_a)

println(punto_a.move(2,3))


class silla(num_patas:Int, comoda: Boolean) {
  override def toString: String = s"La silla tiene $num_patas y $comoda"
  }

var silla_1 = new silla(num_patas = 2, comoda = true)
println(silla_1)


// conditionals

var age: Int = 1

  if ((age >= 0) & (age <= 3)) {
    println("Go to kindergarden")
  }
  else if ((age >= 3) & (age < 10)) {
  println("Go to school")
} else if ((age >=10) & (age <=19)) {
  println("Go to high school")
} else {
  println("I don't care where you go. You are a grown-up")
}


