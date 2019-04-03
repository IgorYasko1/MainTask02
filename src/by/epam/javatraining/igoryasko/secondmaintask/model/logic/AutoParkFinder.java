package by.epam.javatraining.igoryasko.secondmaintask.model.logic;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.IAutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import org.apache.log4j.Logger;

public class AutoParkFinder {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(AutoParkFinder.class);
    }

    public static void checkInputParameters(IAutoPark autoPark) {
        if (autoPark == null || autoPark.size() == 0) {
            logger.info("AutoPark can't be null or empty");
            throw new IllegalArgumentException("AutoPark can't be null or empty");
        }
    }

    public static double totalCost(IAutoPark autoPark) {
        checkInputParameters(autoPark);
        logger.debug("Starting find totalCost " + autoPark);
        double total = 0;
        for (int i = 0; i < autoPark.size(); i++) {
            total += autoPark.getElement(i).getPrice();
        }
        return total;
    }

    public static AutoPark findBiggerAutoPark(IAutoPark... autoPark) {
        if (autoPark.length == 0) {
            logger.info("AutoPark can't be null or empty");
            throw new IllegalArgumentException("AutoPark can't be null or empty");
        }
        logger.debug("Starting findBiggerAutoPark " + autoPark);
        AutoPark result = (AutoPark) autoPark[0];
        for (int i = 0; i < autoPark.length - 1; i++) {
            checkInputParameters(autoPark[i]);
            if (result.size() < autoPark[i].size()) {
                result = (AutoPark) autoPark[i + 1];
            }
        }
        return result;
    }

    public static AbstractVehicle findByPassengersAndPrice(IAutoPark autoPark,
                                                           double amountOfPassengers, int price) {
        checkInputParameters(autoPark);
        if (amountOfPassengers <= 0 || price <= 0) {
            logger.info("AutoPark can't be null or empty");
            throw new IllegalArgumentException("Parameters can't be zero or less");
        }
        logger.debug("Starting find PassengersAndPrice " + autoPark + " " + amountOfPassengers + " " + price);
        for (int i = 0; i < autoPark.size(); i++) {
            if (((Car) autoPark.getElement(i)).getAmountOfPassenger() == amountOfPassengers
                    && autoPark.getElement(i).getPrice() == price) {
                return autoPark.getElement(i);
            }
        }
        throw new IllegalArgumentException("There is no matches");
    }

    public static double minPrice(IAutoPark autoPark) {
        checkInputParameters(autoPark);
        logger.debug("Starting find minPrice " + autoPark);
        double minCost = autoPark.getElement(0).getPrice();

        for (int i = 0; i < autoPark.size(); i++) {
            if (minCost > autoPark.getElement(i).getPrice()) {
                minCost = autoPark.getElement(i).getPrice();
            }
        }

        return minCost;
    }

    public static double maxPrice(IAutoPark autoPark) {
        checkInputParameters(autoPark);
        logger.debug("Starting find maxPrice " + autoPark);
        double minCost = autoPark.getElement(0).getPrice();

        for (int i = 0; i < autoPark.size(); i++) {
            if (minCost < autoPark.getElement(i).getPrice()) {
                minCost = autoPark.getElement(i).getPrice();
            }
        }

        return minCost;
    }


}
