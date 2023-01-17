package org.example.beans.write;

import lombok.AllArgsConstructor;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.RelationalGroupedDataset;
import org.apache.spark.sql.SaveMode;
import org.example.beans.PersonneVaccine;

import java.util.function.Consumer;

@AllArgsConstructor
public class Write implements Consumer<Dataset<PersonneVaccine>>  {

    private final String outputpath;
    
    @Override
    public void accept(Dataset<PersonneVaccine> personneVaccineDataset) {

        personneVaccineDataset.write().mode(SaveMode.Overwrite).csv(outputpath);

    }



}
