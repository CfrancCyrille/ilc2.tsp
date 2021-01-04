package tsp.lee.jacobson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TourTest {

	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testGetDistance_distanceNot0_distance() {
		
		ArrayList<City> cities = new ArrayList<City>();
		cities.add(new City());
		cities.add(new City());
		
		Tour tour = new Tour(cities);
		
		int expected = (int) cities.get(0).distanceTo(cities.get(1)) * 2;
		

		int actual = tour.getDistance(); 
		
		assertEquals(expected, actual);
		
	}

}
