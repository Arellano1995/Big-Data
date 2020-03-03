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

		```
		
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
}if(cont != 2) {
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

# Practica 3
The fibonacci series was performed using 5 different algorithms in the Scala, these are: Recursive, Tail recursion, Iterative, Iterative with variables, Iterative vector.

# Practica 4
What was done in practice number 4 was to create 20 functions with my codemate, where he performed 10 spark functions and I another 10 functions, once we did what we did was talk to learn about what each one did.

# Practica 5
The Data Frame CitiGroup 2006_2008 was used to perform a practice of Spark-based functions for the manipulation of the DataFrame and obtaining advanced queries
