package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	@Test
	public void testGetDistance_0()
	{
		Tour t = new Tour();
		assertEquals(0,t.getDistance());
	}

	@Test
	public void testGetDistance_Sup0()
	{
		City c1 = new City(1,1);
		City c2 = new City(2,2);
		City c3 = new City(3,3);

		ArrayList<City> tour = new ArrayList<City>();

		tour.add(c1);
		tour.add(c2);
		tour.add(c3);

		Tour t = new Tour(tour);
		int expected = 4;

		assertEquals(expected,t.getDistance());

	}
}
