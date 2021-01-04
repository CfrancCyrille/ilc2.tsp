package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void test_DistanceTo() {
		City city1 = new City(0, 0);
		City city2 = new City(1000, 0);

		double expected = Math.sqrt( ( Math.pow(city1.getX() - city2.getX(), 2) ) + ( Math.pow(city1.getY() - city2.getY(), 2) ) );
		double actual = city1.distanceTo(city2);

		assertEquals(expected, actual, 0.0);
	}

}
