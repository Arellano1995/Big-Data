#Evaluation
<b><p align="center">
                                                 TECNOLÓGICO NACIONAL DE MÉXICO</br>
                                                INSTITUTO TECNOLÓGICO DE TIJUANA</br>
                                                      SUBDIRECCIÓN ACADÉMICA</br>
                                              DEPARTAMENTO DE SISTEMAS Y COMPUTACIÓN</br> 
                                                           PERIODO</br>
                                                      Enero - Junio 2020</br>
                                                           CARRERA</br>
                                               Ing. En Sistemas Computacionales</br>
                                                          ASIGNATURA</br> 
                                                          Big Data </br>
                                                           DOCENTE</br>
                                                Jose Christian Romero Hernandez</br>
                                                           EQUIPO</br>
                                             16210783 - Castro Arenas Flavio Daniel</br>  
                                             


</p></b>

## Abstract

What we did in this exam was a machine learnig algorithm, to clean the dataset that was given to us we use multilayer perceptron.

We were granted a dataset called iris.csv, which we cleaned we filtered to be able to work with the data and to be able to make the points that came in the pdf that was given to us, as a final conclusion of neural networks, I could realize that each Once you run the algorithm, it takes less time to finish the process, that is, if the first time it lasted 0.86 seconds, the second time you run it, it would take less time than that, and I also realized that its possibility of success never changes, unless you change it. input layers, hidden layers or output layers, remember it must be balanced or it could overflow.

###Link to video https://youtu.be/1tbG_uEIngI

```scala
//1. Importamos las liberrias a utilizar 

import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.classification.MultilayerPerceptronClassifier
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import spark.implicits._
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.feature.StringIndexer

//Cargamos nuestro dataset 
val data = spark.read.format("csv").option("inferSchema","true").option("header","true").csv("iris.csv")
//hacemos un printschema para ver la estructura de la data
//2 ¿Cuáles son los nombres de las columnas? 
data.show()
// 3. ¿Cómo es el esquema? 
data.printSchema()
//4 Imprime las primeras 5 columnas. 
data.show(5)
//5 Usa el metodo describe () para aprender mas sobre los datos del DataFrame. 
data.describe().show()

// Generamos un vector donde se almacenara las caracteristicas del dataset a evaluar 
// y se aguardan mediante la columna features   
val assembler = new VectorAssembler().setInputCols(Array("sepal_length","sepal_width","petal_length","petal_width")).setOutputCol("features")
// Transformamos los datos utlizando nuestro dataset
val featureSet = assembler.transform(data)


//6 Haga la transformación pertinente para los datos categoricos los cuales seran 
//nuestras etiquetas a clasificar. 

//7 Explicación

//Transformamos los valores categoricos a datos numeros para poder procesarlo 

val labelIndexer = new StringIndexer().setInputCol("species").setOutputCol("label")
val dataindex = labelIndexer.fit(featureSet).transform(featureSet)



// dividmos nuestro data en datos de entrenamiento y datos de prueba
//  60% para entrenamiento y 40% para prueba 
// seed es para iniciar en algun punto en concreto.

val splits = dataindex.randomSplit(Array(0.6, 0.4), seed = 1234L)
val train = splits(0)
val test = splits(1)

//Establecemos las capas de nuestra red neuronal 
// 4 de entreda pasa por 5 y 4 capa intermedia o capa oculta y salida de 3.
val layers = Array[Int](4, 5, 4, 3)


// Hacemos el entramiento de datos aplicando nuestro algoritmo multilayerPerceptron
val trainer = new MultilayerPerceptronClassifier().setLayers(layers).setBlockSize(128).setSeed(1234L).setMaxIter(100)

val model = trainer.fit(train)

//  Creamos nuestro modelo de computacion para determinar nuestro valor de predccion mas acertado 
val result = model.transform(test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator().setMetricName("accuracy")

//8. Imprimimos el resultado de la predicciòn. 
println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")

val t1 = System.nanoTime
val duration = (System.nanoTime - t1) / 1e9d
```
