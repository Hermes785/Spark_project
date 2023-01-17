import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.SparkSession;
import org.example.beans.PersonneVaccine;
import org.example.beans.reader.CsvReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class testFunctionreader {
    @Test
    public  void  testReader(){

        SparkSession sparkSession =  SparkSession.builder().appName("sparkname").master("local[2]").getOrCreate();
       String filePath = "src/test/resources/data.input/vacsi12-dep-2022-01-26-19h10.csv";
        CsvReader  csvReader = new CsvReader(sparkSession, filePath);
        Dataset<PersonneVaccine> result = csvReader.get();
        // test si le result est null
        assertNotNull(result);
        // compare le nombre row attendu au nombre de row existant
        assertEquals(40685, result.count());


    }
}
