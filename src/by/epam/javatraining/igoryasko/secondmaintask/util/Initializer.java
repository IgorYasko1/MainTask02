package by.epam.javatraining.igoryasko.secondmaintask.util;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.freightvehicle.FreightVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.freightvehicle.Truck;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Bus;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.PassengerVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.util.creator.Creator;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Initializer {
    public static double INITIALIZE_PRICE_CAR = 100;
    public static double INITIALIZE_PRICE_BUS = 200;
    public static double INITIALIZE_PRICE_TRUCK = 300;
    public static int INITIALIZE_RELEASE_DATE = 2000;
    public static int INITIALIZE_AMOUNT_OF_PASSENGER_CAR = 4;
    public static int INITIALIZE_AMOUNT_OF_PASSENGER_BUS = 20;
    public static double INITIALIZE_AMOUNT_OF_CARGO = 1000;
    public static String INITIALIZE_COLOR = "white";
    public static final boolean INITIALIZE_TRAILER = true;
    public static final int INITIALIZE_BAGGAGE = 20;

    private static Initializer instance;

    private Initializer() {

    }

    public static Initializer getInstance() {
        if (instance == null) {
            return new Initializer();
        }
        return instance;
    }

    public void initCar(AbstractVehicle car) {
        ((Car)car).setColor(INITIALIZE_COLOR);
        ((PassengerVehicle)car).setAmountOfPassenger(INITIALIZE_AMOUNT_OF_PASSENGER_CAR);
        car.setPrice(INITIALIZE_PRICE_CAR);
        car.setReleaseDate(INITIALIZE_RELEASE_DATE);
    }

    public void initBus(AbstractVehicle bus) {
        bus.setReleaseDate(INITIALIZE_RELEASE_DATE);
        bus.setPrice(INITIALIZE_PRICE_BUS);
        ((PassengerVehicle)bus).setAmountOfPassenger(INITIALIZE_AMOUNT_OF_PASSENGER_BUS);
        ((Bus)bus).setBaggage(INITIALIZE_BAGGAGE);
    }

    public void initTruck(AbstractVehicle truck) {
        truck.setReleaseDate(INITIALIZE_RELEASE_DATE);
        truck.setPrice(INITIALIZE_PRICE_TRUCK);
        ((FreightVehicle)truck).setAmountOfCargo(INITIALIZE_AMOUNT_OF_CARGO);
        ((Truck)truck).setTrailer(INITIALIZE_TRAILER);
    }
    
}
