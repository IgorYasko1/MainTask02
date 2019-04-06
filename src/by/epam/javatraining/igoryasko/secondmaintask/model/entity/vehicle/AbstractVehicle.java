package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public abstract class AbstractVehicle {
    public static double DEFAULT_PRICE = 0;
    public static int DEFAULT_RELEASE_DATE = 0;

    private double price;
    private int releaseDate;
    private FuelType fuelType;

    public AbstractVehicle(){
        price = DEFAULT_PRICE;
        releaseDate = DEFAULT_RELEASE_DATE;
    }

    public AbstractVehicle(double price, int releaseDate) {
        this.price = price;
        this.releaseDate = releaseDate;
    }
    
    public enum FuelType {
        AI95, AI92, DISEL;
    }

    protected abstract boolean isDrive();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractVehicle that = (AbstractVehicle) o;

        if (Double.compare(that.price, price) != 0) return false;
        return releaseDate == that.releaseDate;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + releaseDate;
        return result;
    }

    @Override
    public String toString() {
        return "price " + price + " releaseDate " + releaseDate;
    }

}
