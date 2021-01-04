package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	/**
	 * GIVEN WHEN THEN
	 */

	City A = new City(0,0);
	City B = new City(0,5);
	City C = new City(5,0);

	@Test
	public void distanceTo_CFromC_0() {
		double expected = 0;
		double actual = C.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_BFromA_5() {
		double expected = 5;
		double actual = A.distanceTo(B);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromB_5() {
		double expected = 5;
		double actual = B.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_AFromC_5() {
		double expected = 5;
		double actual = C.distanceTo(A);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_CFromA_5() {
		double expected = 5;
		double actual = A.distanceTo(C);
		assertEquals(expected, actual, 0.0);
	}

	@Test
	public void distanceTo_DFromE_5() {
		City D = new City(10,7);
		City E = new City(7, 3);
		double expected = 5;
		double actual = D.distanceTo(E);
		assertEquals(expected, actual, 0.0);
	}

	@Test(expected=NullPointerException.class)
	public void distanceTo_Null_NullPointerException() {
		double actual = A.distanceTo(null);
	}

	@Test
	public void distanceTo_NegativeBfromA_5(){
		City negativeE = new City(-5,0);
		double expected = 5;
		double actual = A.distanceTo(negativeE);
		assertEquals(expected, actual, 0.0);
	}


}
