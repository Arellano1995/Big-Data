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