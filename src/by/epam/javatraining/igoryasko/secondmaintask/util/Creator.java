package by.epam.javatraining.igoryasko.secondmaintask.util;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Bus;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.freightvehicle.Truck;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Creator {
    private static Creator instance;

    private Creator() {

    }

    public static Creator getInstance(){
        if (instance == null){
            return new Creator();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }

    public Bus createAutobus() {
        return new Bus();
    }

    public Truck createTruck() {
        return new Truck();
    }

    public AutoPark createAutoPark(){
        return new AutoPark();
    }

}
