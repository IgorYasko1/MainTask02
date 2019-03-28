package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.fuel.Fuel;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public abstract class PassengerVehicle extends AbstractVehicle {
    public static double DEFAULT_AMOUNT_OF_PASSENGER = 0;

    private double amountOfPassenger;

    public PassengerVehicle(){
        amountOfPassenger = DEFAULT_AMOUNT_OF_PASSENGER;
    }

    public PassengerVehicle(double cost, int releaseDate, double amountOfPassenger) {
        super(cost, releaseDate);
        this.amountOfPassenger = amountOfPassenger;
    }

    public double getAmountOfPassenger() {
        return amountOfPassenger;
    }

    public void setAmountOfPassenger(double amountOfPassenger) {
        this.amountOfPassenger = amountOfPassenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PassengerVehicle that = (PassengerVehicle) o;

        return Double.compare(that.amountOfPassenger, amountOfPassenger) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(amountOfPassenger);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "amountOfPassenger=" + amountOfPassenger + " " + super.toString();
    }

}
