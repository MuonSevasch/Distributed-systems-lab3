package ru.bmstu.lab3;

public class Flight {
    private final boolean isCancelled;
    private final float delayTime;
    private final int airportId;
    private final int destId;

    public Flight(boolean isCancelled, float delayTime, int airportId, int destId) {
        this.isCancelled = isCancelled;
        this.delayTime = delayTime;

        this.destId = destId;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public float getDelayTime() {
        return delayTime;
    }

    public int getAirportId() {

    }

    public int getDestId() {
        return destId;


    @Override
    public String toString() {
        return "Flight{" +
                "isCancelled=" + isCancelled +
                ", delayTime=" + delayTime +
                ", airportId=" + airportId +
                ", destId=" + destId +
                '}';
    }
}
