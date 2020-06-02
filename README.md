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
                                                Mineria de Datos (BDD-1703TI9A)</br>
                                                           DOCENTE</br>
                                                Jose Christian Romero Hernandez</br>
                                                           EQUIPO</br>
                                             16210958 - Aguirre Ibarra Jesus Armando</br>
                                             16210783 - Castro Arenas Flavio Daniel</br>  
                                             


</p></b>

## Unit 1
### Index
[Practice 1](#id1)

[Practice 2](#id2)

[Practice 3](#id3)

[Practice 4](#id4)

[Practice 5](#id5)

[Practice 6](#id6)

[Practice 7](#id7)

[Practice 8](#id8)

### Practice 1  <a name="id1"></a>
**Abstract**
In this practice, what was requested was to complete the missing lines, that is, the comments that were in the code had to be executed or created, we used a csv called ecommerce, where it showed us how long a person lasted in an application



```scala

// Que el objeto assembler convierta los valores de entrada a un vector
val genderIndexer = new StringIndexer().setInputCol("Sex").setOutputCol("SexIndex")
val embarkIndexer = new StringIndexer().setInputCol("Embarked").setOutputCol("EmbarkIndex")



// Resuma el modelo sobre el conjunto de entrenamiento imprima la salida de algunas metricas!
// Utilize metodo .summary de nuestro  modelo para crear un objeto
// llamado trainingSummary
val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)

import org.apache.spark.ml.Pipeline

val lr = new LogisticRegression()

// val pipeline = new Pipeline().setStages(Array(genderIndexer,embarkIndexer,embarkEncoder,assembler,lr))
val pipeline = new Pipeline().setStages(Array(genderIndexer,embarkIndexer,genderEncoder,embarkEncoder,assembler,lr))

val model = pipeline.fit(training)
// Muestre los valores de residuals, el RMSE, el MSE, y tambien el R^2 .
println("Confusion matrix:")
println(metrics.confusionMatrix)

// Buen trabajo!
```

### Practice 2  <a name="id2"></a>
**Abstract**
This practice we work with the logistic regression algorithm where we use the file separated by commas advertising.csv, where it showed us how much a person spent daily, it showed us their age, the area and the city, also if it was a man or a woman, in order to have two different clusters.



```scala

val Array(training, test) = logregdata.randomSplit(Array(0.7, 0.3), seed = 12345)

import org.apache.spark.ml.Pipeline

val lr = new LogisticRegression()

val pipeline = new Pipeline().setStages(Array(assembler, lr))

val model = pipeline.fit(training)

val results = model.transform(test)

import org.apache.spark.mllib.evaluation.MulticlassMetrics

val predictionAndLabels = results.select($"prediction",$"label").as[(Double, Double)].rdd

val metrics = new MulticlassMetrics(predictionAndLabels)

println("Confusion matrix:")
println(metrics.confusionMatrix)

metrics.accuracy
```
### Practice 3  <a name="id3"></a>
**Abstract**
In this practice we use decision trees, in fact this practice was very similar to one found on a spark website, where it shows us the algorithm and its success rate.

```scala
 val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")
    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")

    val treeModel = model.stages(2).asInstanceOf[DecisionTreeClassificationModel]
    println(s"Learned classification tree model:\n ${treeModel.toDebugString}")

    spark.stop()
  }

main()
```
### Practice 4  <a name="id4"></a>
**Abstract**
In this practice I used decision trees, but this time we changed the training, to see what it changed.

```scala
val evaluator = new MulticlassClassificationEvaluator().setLabelCol("indexedLabel").setPredictionCol("prediction").setMetricName("accuracy")

    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")

    val rfModel = model.stages(2).asInstanceOf[RandomForestClassificationModel]
    println(s"Learned classification forest model:\n ${rfModel.toDebugString}")
```
### Practice 5  <a name="id5"></a>
**Abstract**
In this practice, use the GBT where this algorithm does change its chance of success over time, but each time it runs, the processing time decreases.

```scala
val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${1.0 - accuracy}")

    val gbtModel = model.stages(2).asInstanceOf[GBTClassificationModel]
    println(s"Learned classification GBT model:\n ${gbtModel.toDebugString}")
```
### Practice 6  <a name="id6"></a>
**Abstract**
In this practice I used neural networks or perceptron multilayer where the possibility never went down or up if you ran it again, it only slows down the processing speed, it runs faster and faster, the only way it will change is if we change the inputs, layer hidden and output layer.

```scala
val model = trainer.fit(train)
val result = model.transform(test)
val predictionAndLabels = result.select("prediction", "label")
val evaluator = new MulticlassClassificationEvaluator()
.setMetricName("accuracy")

println(s"Test set accuracy = ${evaluator.evaluate(predictionAndLabels)}")
```
### Practice 7  <a name="id7"></a>
**Abstract**
In this practice we use linearSVC where this algorithm can also be compared with the other algorithms previously seen, if we realize this, less amount of code is used

```scala
val lsvc = new LinearSVC()
.setMaxIter(10)
.setRegParam(0.1)

val lsvcModel = lsvc.fit(training)
```
### Practice 8  <a name="id8"></a>
**Abstract**

In this practice we use logistic regression, in which we dramatically improve the processing speed and the percentage of success
```scala
val evaluator = new MulticlassClassificationEvaluator()
  .setMetricName("accuracy")

val accuracy = evaluator.evaluate(predictions)
println(s"Test Error = ${1 - accuracy}")


```
