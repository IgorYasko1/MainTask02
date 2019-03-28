package by.epam.javatraining.igoryasko.secondmaintask.model.logic;

import by.epam.javatraining.igoryasko.secondmaintask.model.entity.autopark.IAutoPark;
import by.epam.javatraining.igoryasko.secondmaintask.model.entity.vehicle.AbstractVehicle;
import org.apache.log4j.Logger;

public class AutoParkSorter {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(AutoParkFinder.class);
    }



    public static IAutoPark priceSortDescending(IAutoPark autoPark) {
        AutoParkFinder.checkInputParameters(autoPark);
        logger.debug("Starting priceSortDescending " + autoPark);
        int start = 0;
        int end = autoPark.size() - 1;
        doSort(autoPark, start, end);
        return autoPark;
    }

    private static void doSort(IAutoPark autoPark, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int i = startIndex;
        int j = endIndex;
        int currentElement = i - (i - j) / 2;
        while (i < j) {
            while (i < currentElement && (autoPark.getElement(i).getPrice() >= autoPark.getElement(currentElement).getPrice())) {
                i++;
            }
            while (j > currentElement && (autoPark.getElement(currentElement).getPrice() >= autoPark.getElement(j).getPrice())) {
                j--;
            }
            if (i < j) {
                AbstractVehicle tmp = autoPark.getElement(i);
                autoPark.setElement(i, autoPark.getElement(j));
                autoPark.setElement(j, tmp);
                if (i == currentElement) {
                    currentElement = j;
                } else if (j == currentElement) {
                    currentElement = i;
                }
            }
            doSort(autoPark, startIndex, currentElement);
            doSort(autoPark, currentElement + 1, endIndex);
        }
    }

    public static IAutoPark releaseDateSort(IAutoPark autoPark) {
        AutoParkFinder.checkInputParameters(autoPark);
        logger.debug("Starting releaseDateSort " + autoPark);
        for (int i = 0; i < autoPark.size() - 1; i++) {
            for (int j = 0; j < autoPark.size() - 1 - i; j++) {
                if (autoPark.getElement(j).getReleaseDate() > autoPark.getElement(j + 1).getReleaseDate()) {
                    AbstractVehicle tmp = autoPark.getElement(j);
                    autoPark.setElement(j, autoPark.getElement(j + 1));
                    autoPark.setElement(j + 1, tmp);
                }
            }
        }
        return autoPark;
    }

    public static IAutoPark priceSort(IAutoPark autoPark) {
        AutoParkFinder.checkInputParameters(autoPark);
        logger.debug("Starting releaseDateSort " + autoPark);
        for (int i = 0; i < autoPark.size() - 1; i++) {
            for (int j = 0; j < autoPark.size() - 1 - i; j++) {
                if (autoPark.getElement(j).getPrice() > autoPark.getElement(j + 1).getPrice()) {
                    AbstractVehicle tmp = autoPark.getElement(j);
                    autoPark.setElement(j, autoPark.getElement(j + 1));
                    autoPark.setElement(j + 1, tmp);
                }
            }
        }
        return autoPark;
    }

}
