package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * This test class should be run seperately from the Tour test class because the configuration
 * of TourManager Here is not compatible with the other classes configuration
 *
 */
public class GATest {
	
	City c1 = new City(5,4);
	City c2 = new City(5,5);
	City c3 = new City(5,6);
	City c4 = new City(5,5);
	// elitism will always be true in our code since no function of the class GA is able to mofify it
	// and it's a private attribute
	// So only the case where it is true will be tested
	@Test
	/**
	 * Given evolvePopulation
	 * When elitism is true
	 * Then first element of newPopulation is the best element of population given in parameter
	 */
	public void evolvePopulation_elitism_FisrtElemestBestFromLastPop() {
		TourManager.addCity(c1);
		TourManager.addCity(c2);
		TourManager.addCity(c3);
		TourManager.addCity(c4);
		Tour t1 = new Tour();
		t1.setCity(0, c1);
		t1.setCity(1, c2);
		t1.setCity(2, c3);
		t1.setCity(3, c4);
		Tour t2 = new Tour();
		t2.setCity(0, c4);
		t2.setCity(1, c1);
		t2.setCity(2, c2);
		t2.setCity(3, c3);
		
		// Fittest in our case
		Tour t3 = new Tour();
		t3.setCity(0, c1);
		t3.setCity(1, c2);
		t3.setCity(2, c4);
		t3.setCity(3, c3);
		
		// old population
		Population pop = new Population(3, false);
		pop.saveTour(0, t1);
		pop.saveTour(1, t2);
		pop.saveTour(2, t3);
		
		// generate new pop
		Population newPop = GA.evolvePopulation(pop);
		
		
		int expectedDistance = t3.getDistance();
		int actualDistance = newPop.tours[0].getDistance();
		
		assertEquals(expectedDistance, actualDistance);

		
	}

}
