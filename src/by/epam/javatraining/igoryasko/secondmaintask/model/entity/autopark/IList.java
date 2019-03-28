package by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public interface IList {

    boolean add(AbstractVehicle vehicle);

    void setElement(int index, AbstractVehicle vehicle);

    int size();

    AbstractVehicle getElement(int index);

    AbstractVehicle[] getList();

}
