package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	City city1 = new City(11, 10);
	City city2 = new City(8, 6);
	City city3 = new City(5,2);
	double epsilon = 0.001;

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN 0 city
	 * Then distance = 0
	 */
	public void getDistance_0city_distanceNull(){
		Tour tour = new Tour();
		tour.setCity(0, city1);
		double actual_distance = tour.getDistance();
		double expected_distance = 0;

		assertEquals(expected_distance, actual_distance, epsilon);
	}

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN 1 city
	 * THEN distance = 0
	 */
	public void getDistance_1city_distanceNull(){
		TourManager.addCity(city1);

		Tour tour = new Tour();
		tour.setCity(0, city1);

		double actual_distance = tour.getDistance();
		double expected_distance = 0;

		assertEquals(expected_distance, actual_distance, epsilon);
	}

	@Test
	/**
	 * GIVEN getDistance
	 * WHEN 3 cities
	 * THEN all distances between 2 cities are added
	 */
	public void getDistance_3cities_sumDistances(){
		//city1 is already added
		TourManager.addCity(city2);
		TourManager.addCity(city3);

		Tour tour = new Tour();
		tour.setCity(0, city1);
		tour.setCity(1, city2);
		tour.setCity(2, city3);

		double actual_distance = tour.getDistance();
		//distance betweeen each city
		double expected_distance = 5 + 5 + 10;

		assertEquals(expected_distance, actual_distance, epsilon);
	}

}
