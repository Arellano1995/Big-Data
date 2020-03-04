**Table of contents**

[1.-Investigation 1](#Investigation-1) 

[2.-Investigation 2](#Investigation-2) 

[3.-Practica 3](#Practica-3) 

[4.-Practica 4](#Practica-4) 

[5.-Practica 5](#Practica-5) 

[6.-Practica 6](#Practica-6) 

[7.-Practica 7](#Practica-7) 

# Investigation 1
Pearson's correlation coefficient is a test that measures the statistical relationship between two continuous variables. If the association between the elements is not linear, then the coefficient is not adequately represented.
The correlation coefficient can take a range of values ​​from +1 to -1. A value of 0 indicates that there is no association between the two variables. A value greater than 0 indicates a positive association. That is, as the value of one variable increases, so does the value of the other. A value less than 0 indicates a negative association; that is, as the value of one variable increases, the value of the other decreases.
-To carry out the Pearson correlation it is necessary to comply with the following:
-The measurement scale must be an interval or ratio scale.
-The variables must be approximately distributed.
-The association must be linear.
-There should be no outliers in the data.
-How Pearson's correlation coefficient is calculated

# Investigation 2
The variance of the random variables, therefore, consists of a measure linked to their dispersion. This is the hope of the square of the deviation of that variable considered against its medium and is measured in a different unit. For example: in cases where the variable measures a distance in kilometers, its variance is expressed in kilometers squared.

# Practica 1
The following exercises were performed in Scala, these are: Calculate the radius of a circle; Determine if a number is a cousin; Use string interpolation to print a variable; Use slilce to extract a fragment of a string variable; Extract a particular value from a tuple; Answer the question, what is the difference in value and a variable in scala?The following exercises were carried out in Scala, these are: Create a list with three elements; Add 5 items to the previously created list; retrieve 3 items from the list; Create an array of numbers in a range of 1-1000 in steps of 5 in 5; Use conversion to sets to get the unique elements of a list; Create a mutable map with name and ages, and print all its elements.
```scala
// Assessment 1/Practica 1
//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
val cir = 15
val pi = 2*3.1416
val rad = cir / pi


println(rad)





//2. Desarrollar un algoritmo en scala que me diga si un numero es primo
val numero = 3
var cont = 0
for(i <- Range(1, numero + 1)) {
 if( num % i == 0) {
   cont += 1
 }
}
if(cont != 2) {
 println("Numero no primo")
} else {
 println("El numero es primo ")
}

//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"
val bird = "tweet"
val interpolar = "Estoy escribiendo un "+ bird



//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la
//   secuencia "Luke"
  val star = "Hola Luke Yo soy tu padre"
    star.slice(5,9)

//5. Cual es la diferencia en value y una variable en scala?
// La Variable Puede Cambiar de Valor y se denomina variable Mutable
// Value es una variable que no  puede cambiar  de valor y se llama variable inmutable.

//6. Dada la tupla ((2,4,5),(1,2,3),(3.1416,23))) regresa el numero 3.1416

val tupla = ((2,4,5),(1,2,3),(3.1416,23))
println(tupla._3)
```

# Practica 2
The following exercises were carried out in Scala, these are: Create a list with three elements; Add 5 items to the previously created list; retrieve 3 items from the list; Create an array of numbers in a range of 1-1000 in steps of 5 in 5; Use conversion to sets to get the unique elements of a list; Create a mutable map with name and ages, and print all its elements.
```scala
// 1. Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"
 val lista = List("rojo","blanco","negro")
 println(lista)

// 2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"
val c1 = "Verde" :: lista
val c2 = "Amarillo" :: c1
val c3 = "Azul" :: c2
val c4 = "Naranja" :: c3
val c5 = "Perla" :: c4

// 3. Traer los elementos de "lista" "verde", "amarillo", "azul"

var lista = List("rojo", "blanco", "negro","verde","amarillo","azul", "naranja", "perla")
lista.slice(3,6)
// 4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5

val array = (1 to 1000).by(5)
    for(i <- array){
        println(""+i)

    }

// 5. Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos
  val mylist = List(1,3,3,4,5,7,3,7)
    mylist.toSet
// 6. Crea una mapa mutable llamado nombres que contenga los siguiente
//     "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
//  Imprime todas la llaves del mapa
val nombres = collection.mutable.Map(("Jose",20),("Luis",24),("Ana",23),("Susana",27))
nombres.keys
```

# Practica 3
The fibonacci series was performed using 5 different algorithms in the Scala, these are: Recursive, Tail recursion, Iterative, Iterative with variables, Iterative vector.
```scala
#Recursion
def fib1 ( n : Int )  : Int = n match  { 
   case  0 | 1  => n
    caso  _  => fib1 ( n- 1  ) + fib1 ( n- 2  ) 
}

#Tail Recursion
def fib3 ( n : Int )  : Int =  {  
  def fib _ tail ( n : Int, a : Int, b : Int ) : Int = n match  { 
    case  0  => a 
     case  _  => fib _ tail ( n- 1 , b, a + b ) 
  } 
  return fib _ tail ( n, 0 ,1)
}

// serie Fibonnaci 
	
	
	// recursivo 
	 def fib(n:Int) : Int = {
	 if (n<2){n }
	 else { fib(n-1)+fib(n-2)}
	 }
	 for (i<-1 to 10)
	 println(fib(i))
	
	//explicacion 
	 // Link GitHUB 
	
	 //Fiboniacci Recursivo
	val n = 10
	
	def fibonacci1(n:Int) : Int ={
	if (n<2){
	return n
	}
	else{
	 return fibonacci1(n-1) + fibonacci1(n-2)
	}
	} 
	
	println(fibonacci1(n))
	
	
	//Algoritmo 2 Versión con fórmula explícita (6) (Complejidad O 
	
	val n = 10
	var phi=((1+math.sqrt(5))/2)
	var j=((math.pow(phi,n)-math.pow((1-phi),n))/(math.sqrt(5)))
	
	
	def fibonacci2(n:Double) : Double ={
	if (n<2){
	return n
	}
	else {
	
	 return j
	}
	}
	println(fibonacci2(n))
	
	
	
	//Algoritmo 3 Versión iterativa
	//(Complejidad O ( n)
	
	
	def fibonacci3(n:Int):Int={
	var n : Int = 6
	var a = 0
	var b = 1
	var c = 0
	var k = 0 
	
	
	 for(k <- 1 to n) {
	 
	 c = b + a
	 a = b
	 b = c 
	 }
	 return a
	}
	println(fibonacci3(n))
	//Algoritmo 4 Versión iterativa 2 variables (Complejidad (O(n))
	
	
	def fibonacci4(n:Int):Int={
	var n : Int = 10
	var a = 0
	var b = 1
	var k = 0 
	
	
	 for(k <- 1 to n) {
	 b = b + a
	 a = b - a 
	 
	 }
	 return a
	}
	println(fibonacci4(a))
	//Algoritmo 5 Versión iterativa vector (Complejidad O(n))
	
	var n = 10
	def fibonacci4(n:Int):Int={
	 var arreglo = Array (n+2)
	 var i : Int
	 arreglo (0,0)
	 arreglo (1,1)
	
	 for (i <- 1 to 2 )
	}
	println(fibonacci4(a))
	def fib(n: Int): Int = {
	 val n = 10
	 val f: Array[Int] = Array.ofDim[Int](n + 2)
	  f(0) = 0
	 f(1) = 1
	
	 for (i <- 2 to n) {
	 
	 f(i) = f(i - 1) + f(i - 2) //{ i += 1; i - 1 }
	 }
	 f(n)
	 }
	 println(fib(8))
		//ALGORITMO 6
	def fib6 (n : Int) : Double =
	{
	 if (n <= 0)
	 {
	 return 0
	 }
	 var i = n-1
	 var auxOne = 0.0
	 var auxTwo = 1.0
	 var ab = Array(auxTwo,auxOne)
	 var cd = Array(auxOne,auxTwo)
	 while (i>0)
	 {
	 if (i % 2 != 0)
	 {
	 auxOne = cd(1) * ab(1) + cd(0) * ab(0)
	 auxTwo = cd(1) * (ab(1)+ab(0)) + cd(0)*ab(1)
	 ab(0) = auxOne
	 ab(1) = auxTwo 
	 } 
	 auxOne = (math.pow(cd(0),2)) + (math.pow(cd(1),2))
	 auxTwo = cd(1)* (2*cd(0) + cd(1))
	 cd(0) = auxOne
	 cd(1) = auxTwo
	 i = i/2
	 }
	 return (ab(0) + ab(1))
	}
	 def fibi(n:Int, arr:Int) Int , int ={
	
	 for(int i = 0; i < n; i++){
	 if(i < 2)
	 arr[i] = 1;}
	 else
	 arr[i] = arr[i-1] + arr[i-2];
	 return arr[n-1];
	 }
	
	println(fibi(10))
```
# Practica 4
What was done in practice number 4 was to create 20 functions with my codemate, where he performed 10 spark functions and I another 10 functions, once we did what we did was talk to learn about what each one did.
```scala
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("Sales.csv")

df.printSchema()

df.show()

//1
df.describe ("High").show //Describe the statistical values ​​of the selected column
//2 
df.select ("High","Close").show // Displays the related values ​​of the consulted columns.
//3 
df.select ("Open","Low").filter("Close < 480").show // Display the related and selected columns and put a filter to only display those that are less than 480
//4 
df.groupBy ("Open").show
//5
df.first //   return the first column of the dataframe
//6 
df.columns // Returns the dataframe columns
//7 
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume")) // Add a column that derives from the high and Volume column
//8 
df.select(min("Volume")).show() // Choose the volume column min
//9 
df.select(max("Volume")).show() // Choose the volume column max
//10
val df2 = df.withColumn("Year", year(df("Date"))) // create the year column from the date column

// 11 Create the month column from the date column
val df3 = df.withColumn("Month", month(df("Date")))
// 12 create the day column from the month and date column
val df3 = df.withColumn("Day", dayofmonth(df("Date")))
// 13 Create the day column from the year column
al df3 = df.withColumn("Day", dayofyear(df("Date")))
// 14 the correlation between the High and Volume column returns
df.select(corr($"High", $"Volume")).show() 
// 15 Take 1 column from the column
df.select($"High").take(1)
// 16 Split the selected column
df.select("High").repartition().show()
// 17 Draw the High column
df.sort($"High".asc).show() 
// 18 Show the high column average
df.select(avg("High")).show()
// 19 create a list from a collection
df.filter($"Close" < 480 && $"High" < 480).collectAsList()
// 20 returns the last day of the date column
df.select(last_day(df("Date"))).show() 
```
# Practica 5
The Data Frame CitiGroup 2006_2008 was used to perform a practice of Spark-based functions for the manipulation of the DataFrame and obtaining advanced queries
```scala
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header", "true").option("inferSchema","true")csv("CitiGroup2006_2008")
//1 print schema
df.printSchema()
//2 show the dataset
df.show()
//3 show the columns the dataset has
df.columns
//4 show the volume data
df.select("Volume").show()
//5 show the first record of the dataset
df.first()
//6 show the 10 records that head the data set
df.head(10)
//7 show interesting facts about the data
df.describe()
//8 count the total data the data set has
df.count()
//9 order the data
df.sort()
//10 show data that is between the conditions
df.filter($"Close" < 490 && $"low" < 300).show()
//11 draw the correlation
df.select(corr("High", "Low")).show()
//12 sum all data of high
df.select(sum("High")).show()
//13 mean of data
df.select(mean("Low")).show()
//14 max of data
df.select(max("High")).show()
//15 min of data
df.select(min("Low")).show()
//16 variance of data
df.select(variance("Low")).show()
//17 look for an exact data in the column
df.filter($"High" === 487.0).show()
//18 count the values ​​that meet the condition
df.filter($"High" > 480).count()
//19 sample for months
df.select(month(df("Date"))).show()
//20 sample for years
df.select(year(df("Date"))).show()
```
