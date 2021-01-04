package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * No need to test the case when distance == 0 for the function getDistance
 * Because it will just return the distance
 *
 */
public class TourTest {
	City c1 = new City(5,4);
	City c2 = new City(5,5);
	City c3 = new City(5,6);
	@Test
	/**
	 * Given getDistance
	 * When no cities
	 * Then distance is 0
	 */
	public void getDistance_noCities_0() {
		// we need to initialize the tour each time to affect the length of the tour ArrayList
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		
		double actual = tour.getDistance();
		double expected = 0;
		
		assertEquals(expected, actual, 0);
	}
	@Test
	/**
	 * Given getDistance
	 * When only one city
	 * Then distance is 0
	 */
	public void getDistance_OnlyOneCity_0() {

		// add city to possible individual list
		TourManager.addCity(c1);
		// since one individual is in the TourManager.destinationCities
		// the constructor will prepare an ArrayList with one element
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		
		double actual = tour.getDistance();
		double expected = 0;
		
		assertEquals(expected, actual, 0);
	}
	
	@Test
	/**
	 * Given getDistance
	 * When mutliple cities
	 * Then sum of the distances between each two consecutive cities (even last and first)
	 */
	public void getDistance_MultipleCities_SumOfDistances() {
		
		// add city to possible individual list

		TourManager.addCity(c2);
		TourManager.addCity(c3);
		// since one individual is in the TourManager.destinationCities
		// the constructor will prepare an ArrayList with one element
		Tour tour = new Tour();
		tour.setCity(0, c1); 
		tour.setCity(1, c2); 
		tour.setCity(2, c3); 
		
		double actual = tour.getDistance();
		double expected = 4;
		
		assertEquals(expected, actual, 0);
	}

}
