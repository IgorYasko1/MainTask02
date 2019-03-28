package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.freightvehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Truck extends FreightVehicle {
    public static final boolean DEFAULT_TRAILER = true;

    private boolean trailer;

    public Truck(){
        trailer = DEFAULT_TRAILER;
    }

    public Truck(double cost, int releaseDate, double amountOfCargo, boolean trailer) {
        super(cost, releaseDate, amountOfCargo);
        this.trailer = trailer;
    }

    @Override
    public boolean isDrive() {
        return true;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Truck truck = (Truck) o;

        return trailer == truck.trailer;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (trailer ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Truck: " + "trailer=" + trailer + super.toString();
    }

}
