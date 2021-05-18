

for (x <- 0 until 10){
  println(x)
}

var i = 0
while (i <= 100) {
  println(i)
  i += 10
}

var secuencia = Seq(1,2,3,4)

for (i <- secuencia) {
  println(s"El valor es : $i")
}

def print_name(name: String, surname: String): Unit = {
  println(s"My name is $name $surname")
}


print_name(name = "Ramon", surname = "Soto")


var l = List(1,2,3,4)

def triplica(valor: Int): Int = {
  val valor_final = valor * 3
  valor_final
}

println(l.map(x => triplica(x)))

def multiplica_valores(valores: Int*): Int = {
  var resultado = 1
  for (valor <- valores){
    resultado *= valor
  }
  resultado
}

multiplica_valores(1,2,3)


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
  var x: Int = xc
  var y: Int = yc

  override def toString: String = s"Punto ($xc, $yc)"

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x)
    println ("Point y location : " + y)
  }
}


var punto_a = new Point(3,4)

println(punto_a)

println(punto_a.move(2,3))

def suma_todos(args: Int*): Int = {
  var suma = 0: Int
  for (arg <- args) {
    suma += arg
  }
  suma
}

val resultado = suma_todos(1,2,3)
println(resultado)

class silla(num_patas:Int, comoda: Boolean) {
  override def toString: String = s"La silla tiene $num_patas y $comoda"
}

var silla_1 = new silla(num_patas = 2, comoda = true)
println(silla_1)

