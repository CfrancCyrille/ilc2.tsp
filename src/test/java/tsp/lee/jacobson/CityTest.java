package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	/**
	 * Given distanceTo
	 * When two cities with same coordinates
	 * Then distance is 0
	 */
	public void distanceTo_SameCoordinates_0() {
		City c1 = new City(1,1);
		City c2 = new City(1,1);
		
		double actual = c1.distanceTo(c2);
		double expected = 0;
		
		assertEquals(actual, expected,0);
		
	}
	
	@Test
	/**
	 * Given distanceTo
	 * When two cities with horizentally aligned
	 * Then distance is difference between absciss
	 */
	public void distanceTo_HorizentalyAlligned_DiffAbscices() {
		City c1 = new City(1,1);
		City c2 = new City(2,1);
		
		double actual = c1.distanceTo(c2);
		double expected = 1;
		
		assertEquals(actual, expected,0);
		
	}
	
	@Test
	/**
	 * Given distanceTo
	 * When two cities with Vertically aligned
	 * Then distance is difference between ordinates
	 */
	public void distanceTo_VerticallyAlligned_DiffOrdinates() {
		City c1 = new City(1,2);
		City c2 = new City(1,1);
		
		double actual = c1.distanceTo(c2);
		double expected = 1;
		
		assertEquals(actual, expected,0);
		
	}
	
	@Test
	/**
	 * Given distanceTo
	 * When two cities with Diff absciss and ordinate
	 * Then valu2 of the segment joining them
	 */
	public void distanceTo_DiffAbscissAndOrdinate_ValueOfSegmentJoiningThem() {
		City c1 = new City(2,2);
		City c2 = new City(1,1);
		
		double actual = c1.distanceTo(c2);
		double expected = Math.sqrt(2);
		
		assertEquals(actual, expected,0);
		
	}

}
