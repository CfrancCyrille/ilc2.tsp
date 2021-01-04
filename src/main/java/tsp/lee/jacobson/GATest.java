package tsp.lee.jacobson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GATest {

    @Test
    /**
     * Given 1 population
     * When evolve population
     * Then population is evolved if fitness is changed
     */
    void evolvePopulation() {
        // PopulationSize for 100 and inisialise is true
        Population pop = new Population(100, true);

        // Generate population with evolve
        double oldPopFitness = pop.getFittest().getFitness();
        GA.evolvePopulation(pop);
        double newPopFitness = pop.getFittest().getFitness();

        // Test population is evolved, compare fitness pop
        assertNotEquals(oldPopFitness, newPopFitness);
    }
}