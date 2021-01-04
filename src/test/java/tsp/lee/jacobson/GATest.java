package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class GATest {

	/**
	 * GIVEN envolvePopulation
	 * WHEN PopulationInitiale
	 * THEN
	 */
	@Test
	public void testEvolvePopulation() {
		GA algo =  new GA();
		TourManager.addCity(new City(1,1));

		Population pop =  new Population(2, true);
		Population newPop = algo.evolvePopulation(pop);


		Population popAttendue =  new Population(pop.populationSize(), false);

		Tour parent1 = pop.getFittest();
		Tour parent2 = pop.getFittest();
		Tour child = algo.crossover(parent1, parent2);

		popAttendue.saveTour(0,child);


		Population expected = popAttendue;
		Population actual = newPop;
		assertEquals(expected,actual);

	}

}
