package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

    @Test
    public void distanceTo_endCityPlaced5AwayFromStartCity_5() {
        City city1 = new City(0, 0);
        City city2 = new City(3, 4);
        double distance = city1.distanceTo(city2);

        assertEquals(Math.sqrt(3 * 3 + 4 * 4), distance, 0.01);
        assertEquals(5, distance, 0.01);
    }

    @Test
    public void distanceTo_randomPosition_sameDistanceInBothWay() {
        City city1 = new City();
        City city2 = new City();

        assertEquals(city1.distanceTo(city2), city2.distanceTo(city1), 0.01);
    }

    @Test(expected = NullPointerException.class)
    public void distanceTo_null_nullPointerException() {
        City city = new City();
        double test = city.distanceTo(null);
    }

}
