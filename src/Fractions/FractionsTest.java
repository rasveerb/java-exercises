package Fractions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionsTest {
    Fractions testFraction = new Fractions();

    @Test
    public void fractionSum1(){
        assertEquals("5/6",testFraction.fractionSum(1,2,1,3));
    }

    @Test
    public void fractionSum2() {
        assertEquals("13/12",testFraction.fractionSum(1,3,3,4));
    }

    @Test
    public void fractionProduct1() {
        assertEquals("2/6",testFraction.fractionProduct(1,2,2,3));
    }

    @Test
    public void fractionProduct2() {
        assertEquals("2/12",testFraction.fractionProduct(1,4,2,3));
    }
}
