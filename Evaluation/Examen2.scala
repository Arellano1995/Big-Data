//Examn 2     
//1 Logrado
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()
//2 Cargue el archivo
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Netflix_2011_2016.csv")

df.printSchema()
//3 Mostrar nombre de columnas
df.columns
//4 Esquema
df.show()
//5 Mostrar las primeras 5 columnas
df.select("Date","Open","High","Low","Close").show()
//6 usa Describe() para aprender sobre el dataframe
df.describe ("High").show 
//7 Crea un nuevo dataframe con la columna HV ratio
val df2 = df.withColumn("HV Ratio", df("High")+ df("Volume")) //probar
//8 Que dato es el pico mas alto en la comulna close
df.select(max("Close")).show() 
//9 Cual es el significado de la columna close
//Descripcion:Es el valor de cierre de las acciones de netflix.
//10 cual es el maximo y minimo de la columna volumen
df.select(max("Volumen")).show() //maximo
df.select(min("Volumen")).show() //minimo
//11 Con sitaxis/spark contesta lo siguiente
//a) Cuantos dias fue la columna close inferior a $600
df.filter($"Close" < 600).show()// Falta contador para los dias
//b Que % del tiempo fue la columna high mayor a $500

//c Cual es la correlacion de pearson entre columna high y volumen
df.select(corr($"High", $"Volume")).show()
//d Cual es el maximo de la columa high por a;o
df.select(max("High")).show()

//e Cual es el promedio de la columna close para cada  mes del calendario
df.select(avg("Close")).show() 