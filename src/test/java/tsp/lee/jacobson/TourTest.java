package tsp.lee.jacobson;

import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    /**
     * Test of getDistance method, of class Tour.
     * WHEN getDistance() : distance d'une tournée avec deux villes en posistion (4, 5) et en position (2, 3).
     * THEN 4 : distance arrondie entre la première et la deuxième ville. Puis de la deuxième à la première car c'est la dernière.
     */
    @Test
    public void testGetDistance_2Villes() {
        System.out.println("getDistance");
        ArrayList<City> listeVilles = new ArrayList();
        listeVilles.add(new City(2, 3));
        listeVilles.add(new City(4, 5));
        Tour instance = new Tour(listeVilles);
        int expResult = 4;
        int result = instance.getDistance();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDistance method, of class Tour.
     * WHEN getDistance() : distance d'une tournée avec 1 villes.
     * THEN 0 : distance arrondie entre la première et la deuxième ville. Puis de la deuxième à la première car c'est la dernière.
     */
    @Test
    public void testGetDistance_1Villes() {
        System.out.println("getDistance");
        ArrayList<City> listeVilles = new ArrayList();
        listeVilles.add(new City(2, 3));
        Tour instance = new Tour(listeVilles);
        int expResult = 0;
        int result = instance.getDistance();
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDistance method, of class Tour.
     * WHEN getDistance() : distance d'une tournée avec 0 villes.
     * THEN 0 : distance arrondie entre la première et la deuxième ville. Puis de la deuxième à la première car c'est la dernière.
     */
    @Test
    public void testGetDistance_0Villes() {
        System.out.println("getDistance");
        ArrayList<City> listeVilles = new ArrayList();
        Tour instance = new Tour(listeVilles);
        int expResult = 0;
        int result = instance.getDistance();
        System.out.println(result);
        assertEquals(expResult, result);
    }

}