

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;


import java.util.Map;

public class App {

    private static final  String OUTPUT_FILEPATH = "output";
    private static final String AIRPORTS_DATA_FILENAME="airports.csv";







        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaPairRDD<Tuple2<Integer, Integer>, Flight> flights = Parser.parseFlightsPairRDD(sc.textFile(FLIGHTS_DATA_FILENAME));



        Map<Integer, Airport> airportMap = airports.collectAsMap();

        flights.mapToPair(f -> new Tuple2<Tuple2<Integer, Integer>, Float>(f._1, f._2.getDelayTime()))
                .reduceByKey(Math::max)
                .map(data -> new Tuple2<>(new Tuple2<>(broadcast.value().get(data._1._1),





}
