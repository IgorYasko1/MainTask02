package by.epam.javatraining.igoryasko.secondmaintask.controller;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.logic.AutoParkSorter;
import by.epam.javatraining.igoryasko.secondmaintask.util.creator.Creator;
import by.epam.javatraining.igoryasko.secondmaintask.util.Initializer;
import by.epam.javatraining.igoryasko.secondmaintask.view.ConsoleView;
import by.epam.javatraining.igoryasko.secondmaintask.view.IView;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Controller {

    public static void main(String[] args) {
        IView view = new ConsoleView();
        Creator creator = Creator.getInstance();
        Initializer initializer = Initializer.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        AbstractVehicle car = creator.createCar();
        AbstractVehicle bus = creator.createBus();
        AbstractVehicle truck = creator.createTruck();
        initializer.initCar(car);
        initializer.initBus(bus);
        initializer.initTruck(truck);
        autoPark.add(car);
        autoPark.add(bus);
        autoPark.add(truck);
        view.print(AutoParkSorter.priceSortDescending(autoPark));
    }

}
