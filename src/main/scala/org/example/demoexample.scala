package org.example

import org.apache.spark.sql.SparkSession

object demoexample {
  def main (args:Array[String]): Unit =
  {
    val sc = SparkSession.builder().appName("demo").master("local").getOrCreate()
    sc.sparkContext.setLogLevel("Error")
    val rdd = sc.sparkContext.parallelize(Array(1,2,3,4,5,6,7,8,9,10))
    rdd.collect().foreach(println)


  }

}
