package ru.bmstu.lab3;

public class Flight {
    private final boolean isCancelled;




    public Flight(boolean isCancelled, float delayTime, int airportId, int destId) {
        this.isCancelled = isCancelled;
        this.delayTime = delayTime;




    public boolean isCancelled() {



    public float getDelayTime() {




        return airportId;
    }


        return destId;
    }


    public String toString() {
        return "Flight{" +




                '}';

}
