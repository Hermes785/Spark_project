package org.example.beans.transformation;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.example.beans.PersonneVaccine;

import java.util.function.Function;

import static org.apache.spark.sql.functions.count
        ;

public class group implements Function<Dataset<PersonneVaccine>, Dataset<Row>> {
    @Override
    public Dataset<Row> apply(Dataset<PersonneVaccine> personneVaccineDataset) {

      return personneVaccineDataset.groupBy("dep").agg(count("jour"));


    }


/*public class group  implements Function<Dataset<PersonneVaccine>, Dataset<keyClass>> {

    @Override
    public Dataset<keyClass> apply(Dataset<PersonneVaccine> personneVaccineDataset) {
        return null;
    }
}

 */
}

