package by.epam.javatraining.igoryasko.secondmaintask.logic;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.AutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import by.epam.javatraining.igoryasko.secondmaintask.model.logic.AutoParkFinder;
import by.epam.javatraining.igoryasko.secondmaintask.util.Creator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class AutoParkFinderTest {

    @Test
    public void totalCost() {
        AbstractVehicle car = new Car(100, 2000, 4);
        AbstractVehicle car2 = new Car(100, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        double expected = 200;
        assertEquals(expected, AutoParkFinder.totalCost(autoPark));

    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void totalCostNull() {
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        double expected = 200;
        assertEquals(expected, AutoParkFinder.totalCost(autoPark));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkNullInputParameters() {
        AutoPark autoPark = null;
        double expected = 200;
        assertEquals(expected, AutoParkFinder.minPrice(autoPark));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkEmptyInputParameters() {
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        double expected = 200;
        assertEquals(expected, AutoParkFinder.minPrice(autoPark));
    }

    @Test
    public void minPrice() {
        AbstractVehicle car = new Car(100, 2000, 4);
        AbstractVehicle car2 = new Car(100, 2000, 4);
        AbstractVehicle car3 = new Car(200, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        double expected = 100;
        assertEquals(expected, AutoParkFinder.minPrice(autoPark));
    }

    @Test
    public void maxPrice() {
        AbstractVehicle car = new Car(100, 2000, 4);
        AbstractVehicle car2 = new Car(300, 2000, 4);
        AbstractVehicle car3 = new Car(200, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        double expected = 300;
        assertEquals(expected, AutoParkFinder.maxPrice(autoPark));
    }

    @Test
    public void findByPassengersAndPrice() {
        AbstractVehicle car = new Car(400, 2006, 2);
        AbstractVehicle car2 = new Car(100, 2001, 4);
        AbstractVehicle car3 = new Car(200, 2008, 6);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AbstractVehicle expected = new Car(100, 2001, 4);
        assertEquals(expected, AutoParkFinder.findByPassengersAndPrice(autoPark, 4, 100));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void findByPassengersAndPriceCheckParameters() {
        AbstractVehicle car = new Car(400, 2006, 2);
        AbstractVehicle car2 = new Car(100, 2001, 4);
        AbstractVehicle car3 = new Car(200, 2008, 6);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AbstractVehicle expected = new Car(100, 2001, 4);
        assertEquals(expected, AutoParkFinder.findByPassengersAndPrice(autoPark, -1, 0));
    }

    @Test
    public void checkBiggerAutoPark() {
        AbstractVehicle car = new Car(100, 2000, 4);
        AbstractVehicle car2 = new Car(100, 2000, 4);
        AbstractVehicle car3 = new Car(200, 2000, 4);
        Creator creator = Creator.getInstance();
        AutoPark autoPark = creator.createAutoPark();
        autoPark.add(car);
        autoPark.add(car2);
        autoPark.add(car3);
        AutoPark autoPark2 = creator.createAutoPark();
        autoPark2.add(car);
        autoPark2.add(car2);
        AutoPark autoPark3 = creator.createAutoPark();
        autoPark3.add(car);
        AutoPark expected = autoPark;
        assertEquals(expected, AutoParkFinder.findBiggerAutoPark(autoPark, autoPark2, autoPark3));
    }


}
