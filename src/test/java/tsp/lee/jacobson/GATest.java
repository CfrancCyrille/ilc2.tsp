package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class GATest {

	/**
	 * GIVEN WHEN THEN
	 */

	ArrayList<City> cities = new ArrayList<>();

	City city = new City(60, 200);
	cities.add(city)
	City city2 = new City(180, 200);
	cities.add(city2);
	City city3 = new City(80, 180);
	cities.add(city3);
	City city4 = new City(140, 180);
	cities.add(city4);
	City city5 = new City(20, 160);
	cities.add(city5);
	City city6 = new City(100, 160);
	cities.add(city6);
	City city7 = new City(200, 160);
	cities.add(city7);
	City city8 = new City(140, 140);
	cities.add(city8);
	City city9 = new City(40, 120);
	cities.add(city9);
	City city10 = new City(100, 120);
	cities.add(city10);

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void evolvePopulation_emptyPopulation_ArrayIndexOutOfBoundsException() {
		Population emptyPopulation = new Population(0, false);
		Population actual = GA.evolvePopulation(emptyPopulation);
	}

	// CAN'T test this method because i can't get the arraylist to add the created cities
	@Test
	public void evolvePopulation_randomPopulation_ImproveFittest() {
		Population pop = new Population(100, true);
		double fittest_fitness = pop.getFittest().getFitness();

		Population newPop = GA.evolvePopulation(pop);
		double newFittest_fitness = newPop.getFittest().getFitness();

		boolean expected = true;
		// We assert that a better individual has a better fitness value
		boolean actual = newFittest_fitness >= fittest_fitness;
		assertEquals(expected, actual);
	}

}
