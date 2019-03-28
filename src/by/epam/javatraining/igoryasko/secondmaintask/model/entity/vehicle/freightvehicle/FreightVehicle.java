package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.freightvehicle;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public abstract class FreightVehicle extends AbstractVehicle {
    public static double DEFAULT_AMOUNT_OF_CARGO = 0;

    private double amountOfCargo;

    public FreightVehicle(){
        amountOfCargo = DEFAULT_AMOUNT_OF_CARGO;
    }

    public FreightVehicle(double cost, int releaseDate, double amountOfCargo) {
        super(cost, releaseDate);
        this.amountOfCargo = amountOfCargo;
    }

    public double getAmountOfCargo() {
        return amountOfCargo;
    }

    public void setAmountOfCargo(double amountOfCargo) {
        this.amountOfCargo = amountOfCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FreightVehicle that = (FreightVehicle) o;

        return Double.compare(that.amountOfCargo, amountOfCargo) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(amountOfCargo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "amountOfCargo " + amountOfCargo + " " + super.toString();
    }
}
