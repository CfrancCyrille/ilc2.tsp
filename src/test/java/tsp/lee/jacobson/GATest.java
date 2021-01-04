package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

    @Test
    public void evolvePopulation_PopulationSizeOne_NoChange() {
        ArrayList<City> cities = new ArrayList();
        cities.add(new City(0, 0));
        cities.add(new City(3, 4));
        cities.add(new City(6, 8));
        Tour tour = new Tour(cities);

        Population population = new Population(1, false);
        population.saveTour(0, tour);
        Population evolution = GA.evolvePopulation(population);

        assertEquals(evolution.getFittest(), population.getFittest());
        assertEquals(1, population.populationSize());
    }

    @Test
    public void evolvePopulation_2Tour_ElitismPutTheBestInFirstPlace() {
        ArrayList<City> cities1 = new ArrayList();
        cities1.add(new City(0, 0));
        cities1.add(new City(3, 4));
        cities1.add(new City(6, 8));
        Tour bestTour = new Tour(cities1);

        ArrayList<City> cities2 = new ArrayList<>(cities1);
        cities2.add(new City(50, 50));
        Tour worstTour = new Tour(cities2);

        Population population = new Population(2, false);
        population.saveTour(0, worstTour);
        population.saveTour(1, bestTour);
        Population evolution = GA.evolvePopulation(population);

        assertEquals(evolution.getTour(0), bestTour);
    }

    @Test(expected = NullPointerException.class)
    public void evolvePopulation_PopulationNotInitialized_NullPointerException() {
        Population population = new Population(10, false);
        Population test = GA.evolvePopulation(population);
    }

}
