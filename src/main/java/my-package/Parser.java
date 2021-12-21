package ru.bmstu.lab3;





public class Parser {




    private static final int AIRPORT_ID = 14;















    public static JavaPairRDD<Integer, Airport> parseAirports(JavaRDD<String> airports){




                           return new Tuple2<>(id, new Airport(id, name));





    }



        return Parser._parseFlightsPairRDD(a);

    }
}
