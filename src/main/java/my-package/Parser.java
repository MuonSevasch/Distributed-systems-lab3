package ru.bmstu.lab3;


import org.apache.spark.api.java.JavaRDD;
import scala.Tuple2;

public class Parser {


    private static final int IS_CANCELLED = 19;

    private static final int AIRPORT_ID = 14;

    private static final int ORIGIN_AIRPORT_ID = 11;
    private static final int AIRPORT_NAME = 1;




    public static JavaRDD<Flight> parseFlightsRDD(JavaRDD<String> flights){

                      .map(str -> new Flight(str[IS_CANCELLED].equals(CANCELLED_FLAG),
                                             Float.parseFloat(str[DELAY_TIME]),


    }

    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){

                       .mapToPair(str -> {
                           int id = Integer.parseInt(str[AIRPORT_ID]);

                           return new Tuple2<>(id, new Airport(id, name));
                       });
    }

    private static JavaPairRDD<Tuple2<Integer, Integer>, Flight> _parseFlightsPairRDD(JavaRDD<Flight> flights){
        return flights.mapToPair(flight -> new Tuple2<>(new Tuple2<>(flight.getAirportId(), flight.getDestId()), flight));
    }


        JavaRDD<Flight> a = Parser.parseFlightsRDD(flights);
        return Parser._parseFlightsPairRDD(a);

    }
}
