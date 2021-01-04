package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testDistanceTo_sameCity_0() {
		City city1 = new City(1,10);
		City city2 = new City(1,10);
		
		double expected = 0;
		double actual = city1.distanceTo(city2);
		
		assertEquals(expected, actual,0.001);
	}
	
	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testDistanceTo_differentCity_distance() {
		City city1 = new City();
		City city2 = new City();
		
		int xDistance = Math.abs(city1.getX() - city2.getX());
	    int yDistance = Math.abs(city1.getY() - city2.getY());
	    double expected = Math.sqrt( (xDistance*xDistance) + (yDistance*yDistance) );
	        
		
		double actual = city1.distanceTo(city2);
		
		assertEquals(expected, actual,0.001);
	}

}
