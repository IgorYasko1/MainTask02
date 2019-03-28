package by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle;

public class Car extends PassengerVehicle {
    public static String DEFAULT_COLOR = "white";

    private String color;

    public Car() {
        color = DEFAULT_COLOR;
    }

    public Car(double cost, int releaseDate, double amountOfPassenger) {
        super(cost, releaseDate, amountOfPassenger);
    }

    public Car(double cost, int releaseDate, double amountOfPassenger, String color) {
        super(cost, releaseDate, amountOfPassenger);
        this.color = color;
    }

    @Override
    public boolean isDrive() {
        return true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return color != null ? color.equals(car.color) : car.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Car: " + "color " + color + " " + super.toString();
    }

}
