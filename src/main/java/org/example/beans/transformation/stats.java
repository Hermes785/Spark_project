package org.example.beans.transformation;

import lombok.AllArgsConstructor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.example.beans.PersonneVaccine;

import java.util.function.Function;

import static org.apache.spark.sql.functions.count;

@AllArgsConstructor
public class stats implements Function<Dataset<PersonneVaccine>, Dataset<Row>> {


    @Override
    public Dataset<Row> apply(Dataset<PersonneVaccine> personneVaccineDataset) {

        return personneVaccineDataset.agg(count("dep").between(4,100));


    }
}
