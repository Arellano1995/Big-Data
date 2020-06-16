//  Examen 2     
//  1.- Comienza una simple sesion Spark.
//      spark-shell

//  2.- cargue el archivo Netflix Stock CSV, haga que Spark infiera los tipos de datos.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Netflix_2011_2016.csv")

//  3.- Cuales son los nombres de las columnas?
df.columns

//  4.- Como es el esquema?
df.printSchema()
df.show()

//  5.- Imprime las primeras 5 columnas
df.select("Date","Open","High","Low","Close").show()

//  6.- Usa Describe() para aprender sobre el DataFrame
df.describe().show 

//  7.- Crea un nuevo dataframe con la columna HV ratio
//val df2 = df.withColumn("HV Ratio", df("High")+ df("Volume")) //probar
val df2 = df.withColumn("HV Ratio", $"High" / $"Volume") 

//  8.- Que dia tuvo el pico mas alto en la comulna close
val min_max = df.agg(max("Close"),max("Date")).show()

//  9.- Cual es el significado de la columna close
//Es el valor de cierre de las acciones de netflix.

//  10.- cual es el maximo y minimo de la columna volumen
df.select(max("Volumen")).show() //maximo
df.select(min("Volumen")).show() //minimo

//  11 Con sitaxis/spark contesta lo siguiente
//a) Cuantos dias fue la columna close inferior a $600
df.filter($"Close" < 600).count()

//b Que % del tiempo fue la columna high mayor a $500
val high500: Double = df.filter($"High" > 500).count()
(high500 / df.count())*100

//c Cual es la correlacion de pearson entre columna high y volumen
df.select(corr($"High", $"Volume")).show()

//d Cual es el maximo de la columa high por a;o
df.groupBy(year(df("Date"))).max("High").show()

//e Cual es el promedio de la columna close para cada  mes del calendario
df.groupBy(month(df("Date"))).avg("Close").show()