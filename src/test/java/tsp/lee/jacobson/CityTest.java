package tsp.lee.jacobson;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

    /**
     * Test of distanceTo method, of class City.
     * WHEN distanceTo(new City(2, 3)) : distance entre une ville en posistion (4, 5) et une ville en position (2, 3).
     * THEN 2.82 arrondie à 0,01 près.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        City city = new City(2, 3);
        City instance = new City(4, 5);
        double expResult = 2.82;
        double result = instance.distanceTo(city);
        assertEquals(expResult, result, 0.01);
    }
        
    /**
     * Test of distanceTo method, of class City.
     * WHEN distanceTo(new City(2, 3)) : distance entre une ville en posistion (2, 3) et une ville en position (2, 3).
     * THEN 2.82 arrondie à 0,01 près.
     */
    @Test
    public void testDistanceTo_MemeVille() {
        System.out.println("distanceTo");
        City city = new City(2, 3);
        City instance = new City(2, 3);
        double expResult = 0.0;
        double result = instance.distanceTo(city);
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of distanceTo method, of class City.
     * WHEN Distance entre deux villes en position aléatoire dans les deux sens.
     * THEN La même valeur à 0,01 près.
     */
    @Test
    public void testDistanceTo_PositionAleatoireMemeDistanceDansLesDeuxSens () {
        System.out.println("distanceTo");
        City ville1 = new City();
        City ville2 = new City();
        assertEquals(ville1.distanceTo(ville2), ville2.distanceTo(ville1), 0.01);
    }
    
    /**
     * Test of distanceTo method, of class City.
     * WHEN Distance entre une ville et null.
     * THEN NullPointerException.
     */
    @Test(expected=NullPointerException.class)
    public void testDistanceTo_Null_NullPointerException() {
        System.out.println("distanceTo");
        City city = new City(2, 3);
        double result = city.distanceTo(null);
    }
 
}