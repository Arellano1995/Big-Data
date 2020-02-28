
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
