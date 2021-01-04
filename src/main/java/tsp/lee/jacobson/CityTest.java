package tsp.lee.jacobson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
    /**
     * Given 2 city with 2 example distance
     * When distanceTo is calculate
     * Then true for equals distanceTo
     */
    void distanceTo_Is_Same() {
        City a = new City();
        City b = new City();

        a.x = 0;
        a.y = 0;
        b.x = 1;
        b.y = 1;

        double actual = a.distanceTo(b);
        double expected = 1.4142135623730951;
        assertEquals(actual, expected);
    }

    @Test
    /**
     * Given distanceTo
     * When two cities with Diff absciss and ordinate
     * Then valu2 of the segment joining them
     */
    public void distanceTo_DiffAbscissAndOrdinate() {
        City c1 = new City(2,2);
        City c2 = new City(1,1);

        double actual = c1.distanceTo(c2);
        double expected = Math.sqrt(2);

        assertEquals(actual, expected,0);

    }

    @Test
    /**
     * Given distanceTo
     * When two cities with Vertically aligned
     * Then distance is difference between ordinates
     */
    public void distanceTo_DiffOrdinates() {
        City c1 = new City(1,2);
        City c2 = new City(1,1);

        double actual = c1.distanceTo(c2);
        double expected = 1;

        assertEquals(actual, expected,0);

    }



}