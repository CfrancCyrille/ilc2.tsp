package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	City city1 = new City(0, 0);
	City city2 = new City(1, 0);
	City city3 = new City(2, 0);
	City city4 = new City(3, 0);

	/*
	 * Given getDistance
	 * When no cities
	 * Then distance is 0
	 */
	@Test
	public void test_getDistance_0() {
		Tour tour = new Tour();
		int expected = 0;
		int actual = tour.getDistance();

		assertEquals(expected, actual);
	}

	/*
	 * Given getDistance
	 * When cities
	 * Then distance is
	 */
	@Test
	public void test_getDistance_dif0() {
		ArrayList<City> myCities = new ArrayList<City>();


		myCities.add(city1);
		myCities.add(city2);
		myCities.add(city3);
		myCities.add(city4);

		Tour tour = new Tour(myCities);

		double expected = 12;
		double actual = tour.getDistance();

		assertEquals(expected, actual, 0.0);

	}

	@Test
	public void test_getDistance_indexSupToursize() {

	}


}
