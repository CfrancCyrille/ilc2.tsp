package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	/*
	 * GIVEN_WHEN_THEN
	 */
	public void testEvolvePopulation_elitism_fitest() {
		GA g = new GA();
		Population p = new Population(10,true);
		
		double expected = p.getFittest().getFitness();
		
		double actual = g.evolvePopulation(p).getFittest().getFitness();
		
		assertEquals(expected, actual, 0.001);
	}
	

	
}
