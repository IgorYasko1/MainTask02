package by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class ListTest {

    @Test
    public void add() {
        AbstractVehicle car = new Car(100, 2000, 4);
        boolean expected = true;
        List list = new List();
        assertEquals(expected, list.add(car));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void addNullValue() {
        AbstractVehicle car = car = null;
        List list = new List();
        boolean expected = true;
        assertEquals(expected, list.add(car));
    }

}
