package tsp.lee.jacobson;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TourTest {

    @Test
    /**
     * Given 1 tour
     * When get distance, default 0
     * Then distance == 0
     */
    void getDistance() {
        Tour tourA = new Tour();

        int actual = tourA.getDistance();
        int expected = 0;
        assertEquals(actual, expected);

    }
}