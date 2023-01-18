package org.example.beans;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import lombok.extern.slf4j.Slf4j;
import org.apache.spark.SparkConf;
//
 import org.apache.spark.sql.*;
import org.apache.spark.sql.types.DataTypes;
import org.example.beans.PersonneVaccine;
import org.example.beans.reader.CsvReader;
import org.example.beans.transformation.group;
import org.example.beans.transformation.stats;
import org.example.beans.write.Write;

@Slf4j
public class Main  {

    public static void main(String[] args){

        Config config = ConfigFactory.load("application.conf");
        String masterUrl = config.getString("ms2d.spark.master");
        String appName = config.getString("ms2d.appname");
        SparkConf sparkConf = new SparkConf()
                .setMaster(masterUrl)
                .setAppName(appName);

       SparkSession sparkSession = SparkSession.builder().config(sparkConf).getOrCreate();

       String filePath =  config.getString("ms2d.path.input");
        String outputpath =  config.getString("ms2d.path.output");

        CsvReader csvReader = new CsvReader(sparkSession,filePath);
        //stats count = new stats();
        group gr= new group();
        Dataset<Row> ds = gr.apply(csvReader.get());

        Write write = new Write(outputpath);
        ds.printSchema();
        ds.show();
   // count.apply(csvReader.get());

       //ds. gr.apply(csvReader.get());

 write.accept(csvReader.get());
    }

}
