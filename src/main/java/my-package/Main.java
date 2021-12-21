package ru.bmstu.lab3;



public class Main {
    private static final String APP_NAME = "Lab_03";

    public static void main(String[] args){
        SparkConf conf = new SparkConf().setAppName(APP_NAME);
        new App(conf).run();
    }
}
