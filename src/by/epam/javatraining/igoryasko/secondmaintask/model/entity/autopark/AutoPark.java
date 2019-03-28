package by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class AutoPark implements IAutoPark {

    private List list;

    public AutoPark() {
        list = new List();
    }

    public AutoPark(List list) {
        this.list = list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public boolean add(AbstractVehicle vehicle) {
        list.add(vehicle);
        return true;
    }

    @Override
    public void setElement(int index, AbstractVehicle vehicle) {
        list.setElement(index, vehicle);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public AbstractVehicle getElement(int index) {
        return list.getElement(index);
    }

    @Override
    public AbstractVehicle[] getList() {
        return list.getList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutoPark ap2 = (AutoPark) o;

        return list != null ? list.equals(ap2.list) : ap2.list == null;
    }

    @Override
    public int hashCode() {
        return list != null ? list.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutoPark{" +
                "list=" + list +
                '}';
    }

}
