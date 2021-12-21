









public class App {

    private static final  String OUTPUT_FILEPATH = "output";








        JavaSparkContext sc = new JavaSparkContext(conf);









                .map(data -> new Tuple2<>(new Tuple2<>(broadcast.value().get(data._1._1),





}
