package ru.bmstu.lab3;





public class Parser {


    private static final int IS_CANCELLED = 19;

    private static final int AIRPORT_ID = 14;

    private static final int ORIGIN_AIRPORT_ID = 11;
    private static final int AIRPORT_NAME = 1;










    }

    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){




                           return new Tuple2<>(id, new Airport(id, name));
                       });




    }


        JavaRDD<Flight> a = Parser.parseFlightsRDD(flights);
        return Parser._parseFlightsPairRDD(a);

    }
}
