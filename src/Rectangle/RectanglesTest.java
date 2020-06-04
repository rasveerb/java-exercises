package Rectangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectanglesTest {

    @Test
    public void rectangleAreaTestSingleDigits() {

        Rectangles testRectangle = new Rectangles();

        assertEquals(30, testRectangle.rectangleArea(6, 5),0);
    }

    @Test
    public void rectangleAreaTestDoubleDigits() {

        Rectangles testRectangle = new Rectangles();

        assertEquals(400, testRectangle.rectangleArea(16, 25),0);
    }

    @Test
    public void rectangleAreaTestTripleDigits() {

        Rectangles testRectangle = new Rectangles();

        assertEquals(230104, testRectangle.rectangleArea(392, 587),0);
    }
}