





public class Parser {




















    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){




                           return new Tuple2<>(id, new Airport(id, name));





    }



        return Parser._parseFlightsPairRDD(a);


}
