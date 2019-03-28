package by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;

import java.util.Arrays;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

class List implements IList {
    public static final int DEFAULT_AND_INCREASE_CAPACITY = 10;

    private AbstractVehicle[] list;
    private int length;

    List() {
        list = new AbstractVehicle[DEFAULT_AND_INCREASE_CAPACITY];
    }

    List(List list){
        this.list = new AbstractVehicle[list.length];
        for (int i = 0; i < list.length; i++){
            this.list[i] = list.getElement(i);
            this.length++;
        }
    }

    List(AbstractVehicle[] list, int length) {
        this.list = list;
        this.length = length;
    }

    @Override
    public AbstractVehicle[] getList() {
        return list;
    }

    public void setList(AbstractVehicle[] list) {
        this.list = list;
    }

    @Override
    public void setElement(int index, AbstractVehicle vehicle) {
        list[index] = vehicle;
    }

    @Override
    public AbstractVehicle getElement(int index) {
        return list[index];
    }

    @Override
    public boolean add(AbstractVehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle can't be null");
        }
        if (length == list.length) {
            increaseSize();
        }
        list[length] = vehicle;
        length++;
        return true;
    }

    private void increaseSize() {
        increaseSize(DEFAULT_AND_INCREASE_CAPACITY);
    }

    private void increaseSize(int capacity) {
        AbstractVehicle[] newList = new AbstractVehicle[list.length + capacity];
        System.arraycopy(list, 0, newList, 0, list.length);
        list = newList;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        List list1 = (List) o;

        if (length != list1.length) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(list, list1.list);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(list);
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "List{" +
                "list=" + Arrays.toString(list) +
                ", length=" + length +
                '}';
    }

}
