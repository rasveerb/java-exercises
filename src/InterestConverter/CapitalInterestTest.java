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

}
