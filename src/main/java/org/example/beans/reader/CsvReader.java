package org.example.beans.reader;

import lombok.AllArgsConstructor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.example.beans.PersonneVaccine;

import java.util.function.Supplier;
@AllArgsConstructor
public class CsvReader implements Supplier<Dataset<PersonneVaccine>> {
    private final SparkSession sparkSession ;
    private  final  String filePath;
    @Override
    public Dataset<PersonneVaccine> get() {
              Dataset<PersonneVaccine> ds= sparkSession.read()
                .option("delimiter",";")
                .option("header","true")
                .csv(filePath)
                .as(Encoders.bean(PersonneVaccine.class));

               return  ds;
    }
}
