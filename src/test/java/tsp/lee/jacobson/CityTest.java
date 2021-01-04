package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void testDistanceTo() {
		City cDeBase = new City(1,1);
		City c = new City(2,2);

		double expected = Math.sqrt( 2 );
		double actual = cDeBase.distanceTo(c);

		assertEquals(expected, actual, 0);

	}

}
