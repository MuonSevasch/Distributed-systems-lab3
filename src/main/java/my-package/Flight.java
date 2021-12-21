package ru.bmstu.lab3;

public class Flight {
    private final boolean isCancelled;
    private final float delayTime;



    public Flight(boolean isCancelled, float delayTime, int airportId, int destId) {
        this.isCancelled = isCancelled;
        this.delayTime = delayTime;


    }

    public boolean isCancelled() {



    public float getDelayTime() {



    public int getAirportId() {
        return airportId;
    }

    public int getDestId() {
        return destId;
    }


    public String toString() {
        return "Flight{" +

                ", delayTime=" + delayTime +


                '}';

}
