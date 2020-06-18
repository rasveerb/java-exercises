package Rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectanglesTest {

    Rectangles testRectangle = new Rectangles();

    @Test
    public void rectangleAreaTestSingleDigits() {

        assertEquals(30, testRectangle.rectangleArea(6, 5),0);
    }

    @Test
    public void rectangleAreaTestDoubleDigits() {

        assertEquals(400, testRectangle.rectangleArea(16, 25),0);
    }

    @Test
    public void rectangleAreaTestTripleDigits() {

        assertEquals(230104, testRectangle.rectangleArea(392, 587),0);
    }
}