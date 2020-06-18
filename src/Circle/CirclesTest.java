package Circle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CirclesTest {
    Circles testCircle = new Circles();

    @Test
    public void circleArea() {

        assertEquals(78.53981633974483, testCircle.area(5), 0);
    }

    @Test
    public void circleCircumference() {

        assertEquals(31.41592653589793, testCircle.circumference(5), 0);
    }
}