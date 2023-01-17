public class groupeFonctionTest {
/*
    private SparkSession sparkSession = SparkSession.builder().appName("GroupTest").master("local[2]").getOrCreate();

    @Test
    public void testGroup() {
        List<PersonneVaccine> data = Arrays.asList(
                new PersonneVaccine(1, "2022-01-01"),
                new PersonneVaccine(1, "2022-01-02"),
                new PersonneVaccine(2, "2022-01-01")
        );
        Dataset<PersonneVaccine> input = sparkSession.createDataset(data, Encoders.bean(PersonneVaccine.class));
        group grouper = new group();
        Dataset<Row> output = grouper.apply(input);

        // Vérifie qu'il y a bien 2 groupes (1 pour chaque département)
        assertEquals(2, output.count());

        // Vérifie que pour le département 1, il y a 2 jours de vaccination
        output.filter("dep = 1").first().getAs("count(jour)").equals(2);

        // Vérifie que pour le département 2, il y a 1 jour de vaccination
        output.filter("dep = 2").first().getAs("count(jour)").equals(1);
    }
    */
}
