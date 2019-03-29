package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Bus extends PassengerVehicle {
    public static final int DEFAULT_BAGGAGE = 0;

    private int baggage;

    public Bus() {
        baggage = DEFAULT_BAGGAGE;
    }

    public Bus(double cost, int releaseDate, int amountOfPassenger, int tripDistance) {
        super(cost, releaseDate, amountOfPassenger);
        this.baggage = tripDistance;
    }

    @Override
    public boolean isDrive() {
        return true;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus autobus = (Bus) o;

        return baggage == autobus.baggage;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + baggage;
        return result;
    }

    @Override
    public String toString() {
        return "Bus: " + "baggage=" + baggage + super.toString();
    }

}
