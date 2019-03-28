package by.epam.javatraining.igoryasko.secondmaintask.util;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.passengervehicle.Car;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by igoryasko
 *
 * @author igoryasko
 */

public class Initializer {
    public static final int DEFAULT_AMOUNT_RANDOM = 10;

    private static Initializer instance;

    private Initializer() {

    }

    public static Initializer getInstance() {
        if (instance == null) {
            return new Initializer();
        }
        return instance;
    }

    private static double generateRandom() {
        Random random = new Random();
        return random.nextDouble() * DEFAULT_AMOUNT_RANDOM;
    }

//    public static void initializeAutoParkFromFile() {
//        try (Scanner sc = new Scanner(Paths.get(path))) {
//            int i = 0;
//            while (sc.hasNextDouble()) {
//                autoPark.setElement(sc.nextDouble(), i);
//                i++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public AbstractVehicle random(){
//        for (int i = 0; i < DEFAULT_AMOUNT_RANDOM; i++){
//            AbstractVehicle car = new Car();
//        }
//        return car;
//    }

}
