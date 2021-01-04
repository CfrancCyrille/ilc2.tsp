package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    @Test
    public void getDistance_emptyTour_0() {
        ArrayList<City> cities = new ArrayList();
        Tour tour = new Tour(cities);

        assertEquals(0, tour.getDistance());
    }

    @Test
    public void getDistance_randomTour_distanceIsSumOfDistancesBetweenCities() {
        ArrayList<City> cities = new ArrayList();
        cities.add(new City(0, 0));
        cities.add(new City(3, 4));
        cities.add(new City(6, 8));
        Tour tour = new Tour(cities);
        double sumOfDistance = cities.get(0).distanceTo(cities.get(1));
        sumOfDistance += cities.get(1).distanceTo(cities.get(2));
        sumOfDistance += cities.get(2).distanceTo(cities.get(0));

        assertEquals(sumOfDistance, tour.getDistance(), 0.01);
    }

}
