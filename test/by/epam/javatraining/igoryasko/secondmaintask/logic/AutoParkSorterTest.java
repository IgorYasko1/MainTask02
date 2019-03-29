package by.epam.javatraining.igoryasko.secondmaintask.logic;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import by.epam.javatraining.igoryasko.secondmaintask.model.logic.AutoParkSorter;
import by.epam.javatraining.igoryasko.secondmaintask.util.creator.Creator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class AutoParkSorterTest {

    @Test
    public void priceSortDescending() {
        AbstractVehicle car = new Car(200, 2000, 4);
        AbstractVehicle car2 = new Car(100, 2000, 4);
        AbstractVehicle car3 = new Car(300, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AutoPark expected = creator.createAutoPark();
        expected.add(car3);
        expected.add(car);
        expected.add(car2);
        assertEquals(expected.getList(), AutoParkSorter.priceSort(autoPark).getList());

    }

    @Test
    public void priceSort() {
        AbstractVehicle car = new Car(200, 2000, 4);
        AbstractVehicle car2 = new Car(100, 2000, 4);
        AbstractVehicle car3 = new Car(300, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AutoPark expected = creator.createAutoPark();
        expected.add(car2);
        expected.add(car);
        expected.add(car3);
        assertEquals(expected.getList(), AutoParkSorter.priceSort(autoPark).getList());

    }

    @Test
    public void releaseDateSort() {
        AbstractVehicle car = new Car(100, 2006, 4);
        AbstractVehicle car2 = new Car(100, 2004, 4);
        AbstractVehicle car3 = new Car(300, 2002, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AutoPark expected = creator.createAutoPark();
        expected.add(car3);
        expected.add(car2);
        expected.add(car);
        assertEquals(expected.getList(), AutoParkSorter.releaseDateSort(autoPark).getList());
    }

}
