package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

	@Test
	public void testEvolvePopulation() {

		Population p = new Population(2,true);
		Population newPop = new Population(2,false);

		GA ga = new GA();
		Population actual = ga.evolvePopulation(p);

		Population tournament = new Population(2, false);
		int randomId = 1;
		tournament.saveTour(0, p.getTour(randomId));
		randomId = 0;
		tournament.saveTour(1, p.getTour(randomId));

		Tour parent1 = tournament.getFittest();
		Tour parent2 = tournament.getFittest();
		Tour child = ga.crossover(parent1,parent2);
		Tour child2 = ga.crossover(parent2,parent1);

		newPop.saveTour(0,child);
		newPop.saveTour(1,child2);


		assertEquals(newPop,actual);

	}


	}
