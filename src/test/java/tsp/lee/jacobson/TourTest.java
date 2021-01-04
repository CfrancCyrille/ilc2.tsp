package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class TourTest {

	/**
	 * GIVEN WHEN THEN
	 */

	ArrayList path = new ArrayList();
	City A = new City(0,0);
	City B = new City(3,4);
	City C = new City(1, 1);


	@Test
	public void getDistance_emptyTour_0() {
		Tour emptyTour = new Tour();
		int expected = 0;
		int actual = emptyTour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_oneCity_0() {
		path.add(B);
		Tour tour = new Tour(path);
		int expected = 0;
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}
	@Test
	public void getDistance_AB_10() {
		path.add(A);
		path.add(B);
		Tour tour = new Tour(path);
		int expected = 10; // real path is A->B->A because of the comeback of the salesman
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_ABC_9() {
		path.add(A);
		path.add(B);
		path.add(C);
		Tour tour = new Tour(path);
		int expected = 9; // 5 + sqrt(13) (3,6...) + sqrt(2) (1,4)..
						  // values are getting truncated when converted from double to int
						  // so expected is 5 + 3 + 1 = 9
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

	@Test
	public void getDistance_ABAC_12() {
		path.add(A);
		path.add(B);
		path.add(A);
		path.add(C);
		Tour tour = new Tour(path);
		int expected = 12; // 5 + 5 + sqrt(2) (1,4) + sqrt(2) = 5+5+1+1=12
		int actual = tour.getDistance();
		assertEquals(expected, actual);
	}

}
