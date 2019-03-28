package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Bus extends PassengerVehicle {
    public static final int DEFAULT_TRIP_DISTANCE = 0;

    private int tripDistance;

    public Bus() {
        tripDistance = DEFAULT_TRIP_DISTANCE;
    }

    public Bus(double cost, int releaseDate, double amountOfPassenger, int tripDistance) {
        super(cost, releaseDate, amountOfPassenger);
        this.tripDistance = tripDistance;
    }

    @Override
    public boolean isDrive() {
        return true;
    }

    public int getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus autobus = (Bus) o;

        return tripDistance == autobus.tripDistance;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + tripDistance;
        return result;
    }

    @Override
    public String toString() {
        return "Bus: " + "tripDistance=" + tripDistance + super.toString();
    }

}
