

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;





public class App {

    private static final  String OUTPUT_FILEPATH = "output";
    private static final String AIRPORTS_DATA_FILENAME="airports.csv";







        JavaSparkContext sc = new JavaSparkContext(conf);









                .map(data -> new Tuple2<>(new Tuple2<>(broadcast.value().get(data._1._1),





}
