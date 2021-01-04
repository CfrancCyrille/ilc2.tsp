package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class GATest {

    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient qu'un seule tournée : C'est donc la meilleur.
     * THEN La population retournée est un nouvelle objet contenant une seule Tournée qui contient les mêmes villes dans le même ordre.
     */
    @Test
    public void testEvolvePopulation_1SeulTourneeConnue_PasDeChangement() {
        System.out.println("evolvePopulation");
        
        ArrayList<City> listeVilles = new ArrayList();
        listeVilles.add(new City(2, 3));
        listeVilles.add(new City(4, 5));
        Tour tour = new Tour(listeVilles);
        
        Population population = new Population(1, false);
        population.saveTour(0, tour);
        Population result = GA.evolvePopulation(population);
        
        assertEquals(result.getTour(0).getCity(0), listeVilles.get(0));
        assertEquals(result.getTour(0).getCity(1), listeVilles.get(1));
    }
    
    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient qu'un seule tournée inconnue dont l'ordre est générée aléatoirement.
     * THEN La population retournée est un nouvelle objet contenant une seule Tournée qui contient les mêmes villes dans le même ordre.
     */
    @Test
    public void testEvolvePopulation_1SeulTourneeInconnue_PasDeChangement() {
        System.out.println("evolvePopulation");
        
        City ville1 = new City(2, 3);
        TourManager.addCity(ville1);
        City ville2 = new City(4, 5);
        TourManager.addCity(ville2);
        
        Population population = new Population(1, true);
        Population result = GA.evolvePopulation(population);
        
        assertEquals(result.getTour(0).getCity(0), population.getTour(0).getCity(0));
        assertEquals(result.getTour(0).getCity(1), population.getTour(0).getCity(1));
    }
    
    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient qu'un seule tournée connue.
     * THEN La population retournée est un nouvelle objet contenant une seule Tournée qui contient les mêmes villes dans le même ordre. La taille des deux populations sont donc identiques.
     */
    @Test
    public void testEvolvePopulation_1SeulTournee_NombreDeTournee() {
        System.out.println("evolvePopulation");
        
        ArrayList<City> listeVilles = new ArrayList();
        listeVilles.add(new City(2, 3));
        listeVilles.add(new City(4, 5));
        Tour tour = new Tour(listeVilles);
        
        Population population = new Population(1, false);
        population.saveTour(0, tour);
        Population result = GA.evolvePopulation(population);
        
        assertEquals(result.populationSize(), population.populationSize());
    }
    
    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient 2 tournée : une tournée avec un meilleur fitness qu' l'autre.
     * THEN La population retournée est un nouvelle objet contenant la meilleur tournée en premier.
     */
    @Test
    public void evolvePopulation_2TourneeAvecLaMeilleurEnPremier() {
        System.out.println("evolvePopulation");
        ArrayList<City> listeVilles1 = new ArrayList();
        listeVilles1.add(new City(2, 3));
        listeVilles1.add(new City(3, 4));
        Tour tour1 = new Tour(listeVilles1);
        ArrayList<City> listeVilles2 = new ArrayList<>(listeVilles1);
        listeVilles2.add(new City(2, 3));
        listeVilles2.add(new City(3, 4));
        listeVilles2.add(new City(5, 6));
        Tour tour2 = new Tour(listeVilles2);

        Population population = new Population(2, false);
        population.saveTour(0, tour1);
        population.saveTour(1, tour2);
        Population result = GA.evolvePopulation(population);
        assertEquals(result.getTour(0), tour1);
    }
    
    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient aucune tournée.
     * THEN ArrayIndexOutOfBoundsException car il n'y a pas de meilleur tournée.
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testEvolvePopulation_0TourneeException() {
        System.out.println("evolvePopulation");
        Population population = new Population(0, false);
        Population result = GA.evolvePopulation(population);
    }
    
    /**
     * Test of evolvePopulation method, of class GA.
     * WHEN evolvePopulation() : On fait évoluer une population qui contient une tournée non intiialisée.
     * THEN NullPointerException.
     */
    @Test(expected=NullPointerException.class)
    public void evolvePopulation_PopulationNonInitialise_NullPointerException() {
        System.out.println("evolvePopulation");
        Population population = new Population(2, false);
        Population result = GA.evolvePopulation(population);
    }

}