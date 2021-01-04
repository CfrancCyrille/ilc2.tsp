package tsp.lee.jacobson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TourTest {

    @Test
    /**
     * Given 1 tour
     * When get distance, default 0
     * Then distance == 0
     */
    void getDistance_isSame() {
        Tour tourA = new Tour();

        int actual = tourA.getDistance();
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    /**
     * Given getDistance
     * When only one city
     * Then distance is 0
     */
    public void getDistance_OnlyOneCity_0() {
        City city1 = new City(5,4);

        // add city to possible individual list
        TourManager.addCity(city1);
        // since one individual is in the TourManager.destinationCities
        // the constructor will prepare an ArrayList with one element
        Tour tour = new Tour();
        tour.setCity(0, city1);

        double actual = tour.getDistance();
        double expected = 0;

        assertEquals(expected, actual, 0);
    }
}