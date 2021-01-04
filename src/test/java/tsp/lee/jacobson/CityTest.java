package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	/**
	 * GIVEN distanceTo
	 * WHEN ville1(1,1) et ville(1,2)
	 * THEN 1
	 */
	@Test
	public void testDistanceTo_ville1_ville2_1() {
		City ville1 = new City(1,1);
		City ville2 = new City(1, 2);

		double expected =1;
		double actual =ville1.distanceTo(ville2);
		assertEquals(expected, actual,0);
	}

}
