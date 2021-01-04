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
    void distanceTo() {
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

}