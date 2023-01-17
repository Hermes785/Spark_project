package org.example.beans.transformation;

import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.*;
import org.example.beans.PersonneVaccine;

import static org.apache.spark.sql.functions.count;

public class keyClass {
    public void getgrouby() {
        String filePath = "src/test/resources/data.input/vacsi12-dep-2022-01-26-19h10.csv";
        SparkSession spark = SparkSession.builder().appName("GroupByKeyExample").getOrCreate();

        Encoder<PersonneVaccine> personEncoder = Encoders.bean(PersonneVaccine.class);

        Dataset<PersonneVaccine> personnesV = spark.read().csv(filePath).as(personEncoder);

        KeyValueGroupedDataset<Integer, PersonneVaccine> groupByDep = personnesV.groupByKey((MapFunction<PersonneVaccine, Integer>) p -> p.getDep(), Encoders.INT());

    }
}