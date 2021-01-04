package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	/**
	 * GIVEN getDistance
	 * WHEN 0
	 * THEN 0
	 */
	@Test
	public void testGetDistance_0_0() {
		Tour tour = new Tour();

		int expected = 0 ;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}

	/**
	 * GIVEN getDistance
	 * WHEN ville1 ville2
	 * THEN 2
	 */
	@Test
	public void testGetDistance_liste2Villes_2() {
		ArrayList<City> listeVilles = new ArrayList<>();
		listeVilles.add(new City(1,1));
		listeVilles.add(new City(1,2));
		Tour tour = new Tour(listeVilles);

		int expected = 2; //aller-retour
		int actual = tour.getDistance();

		assertEquals(expected, actual);
	}


	/**
	 * GIVEN getDistance
	 * WHEN ville1 ville2 ville3
	 * THEN 5
	 */
	@Test
	public void testGetDistance_liste3Villes_5() {
		ArrayList<City> listeVilles = new ArrayList<>();
		listeVilles.add(new City(1,1));
		listeVilles.add(new City(1,2));
		listeVilles.add(new City(3,3));
		Tour tour = new Tour(listeVilles);

		int expected = 5;
		int actual = tour.getDistance();

		assertEquals(expected,actual);
	}
}
