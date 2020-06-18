package InterestConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalInterestTest {

    CapitalInterest testConverter = new CapitalInterest();

    double interest = 2.3;

    @Test
    public void fiveYearInterest() {

        assertEquals(112.04,testConverter.interestCalculator(100,interest,5),0);
    }

    @Test
    public  void hundredYearInterest() {
        assertEquals(971.77,testConverter.interestCalculator(100,interest,100),0);
    }

    @Test
    public void fiveHundredYearInterest() {
        assertEquals(8665963.51, testConverter.interestCalculator(100,interest,500),0);
    }

}
