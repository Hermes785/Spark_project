import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.example.beans.PersonneVaccine;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class testFunctionWrite {
/*
    @Before
    public void setUp() {
        sparkSession = SparkSession.builder().appName("WriteTest").master("local[2]").getOrCreate();
        // Initialisation du dataset de test
        dataset = sparkSession.createDataFrame(Arrays.asList(
                        new PersonneVaccine(1, "2022-01-01"),
                        new PersonneVaccine(2, "2022-01-02"),
                        new PersonneVaccine(3, "2022-01-03")),
                PersonneVaccine.class);
    }
*/

    @Test
    public void TestWrit(){
        SparkSession sparkSession =  SparkSession.builder().appName("sparkApp").master("local[2]").getOrCreate();
        String outputpath= "target/test-classes/data/output";
     //   Dataset<PersonneVaccine> dataset = sparkSession.createDataFrame(List.of(
           //     new PersonneVaccine(1,"2020-12-27",0,0,0,0,0,0,0,0,0)), Encoders.bean(PersonneVaccine.class));

    }
/*
    Write write = new Write(outputPath);
        write.accept(dataset);

    // Vérification que le fichier est créé
    File outputFile = new File(outputPath);
        Assert.assertTrue(outputFile.exists());
    // Vérification que le fichier contient les données attendues
    Dataset<String> outputDataset = sparkSession.read().text(outputPath);
        Assert.assertEquals(3, outputDataset.count());
        Assert.assertEquals("1,2022-01-01", outputDataset.first());
    // Suppression du fichier après le test
        outputFile.delete();
}
*/
}
