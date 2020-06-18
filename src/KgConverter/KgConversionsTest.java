package KgConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class KgConversionsTest {

    KgConversions testConverter = new KgConversions();

    double kg = 0.45359237;

    @Test
    public void tonToKg() {

       assertEquals(1016.05, testConverter.tonToKg(2240, kg),0);
    }

    @Test
    public void hundredweightToKg(){

        assertEquals(50.8, testConverter.hundredWeightToKg(112, kg), 0);
    }

    @Test
    public void quarterToKg(){

        assertEquals(12.7, testConverter.quarterToKg(28, kg), 0);
    }

    @Test
    public void stoneToKg() {

        assertEquals(6.35, testConverter.stoneToKg(14, kg), 0);
    }

    @Test
    public void ounceToKg() {

        assertEquals(0.03, testConverter.ounceToKg(0.0625, kg), 0);
    }

    @Test
    public void stonesAndOuncesToKg(){

        assertEquals(72.57, testConverter.stonesAndOuncesToKg(11,6, kg), 0);
    }

    @Test
    public void drachmToKg() {

        assertEquals(0, testConverter.drachmToKg(0.00390625, kg), 0);
    }

    @Test
    public void grainToKg() {

        assertEquals(0, testConverter.grainToKg(0.00014285714, kg), 0);
    }
}
