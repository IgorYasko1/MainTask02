package by.epam.javatraining.igoryasko.secondmaintask.controller;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.logic.AutoParkSorter;
import by.epam.javatraining.igoryasko.secondmaintask.util.Creator;
import by.epam.javatraining.igoryasko.secondmaintask.util.Initializer;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Controller {

    public static void main(String[] args) {
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        Initializer initializer = Initializer.getInstance();
        autoPark.add(initializer.random());
        AutoParkSorter.priceSortDescending(autoPark);
    }

}
