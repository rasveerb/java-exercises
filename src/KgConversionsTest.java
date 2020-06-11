import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class KgConversionsTest {

    @Test
    public void tonToKg() {
        KgConversions testConverter = new KgConversions();

       assertEquals(1016.05, testConverter.tonToKg(2240, 0.45359237),0);
    }

    @Test
    public void hundredweightToKg(){
        KgConversions testConverter = new KgConversions();

        assertEquals(50.8, testConverter.hundredWeightToKg(112, 0.45359237), 0);
    }

    @Test
    public void quarterToKg(){
        KgConversions testConverter = new KgConversions();

        assertEquals(12.7, testConverter.quarterToKg(28, 0.45359237), 0);
    }

    @Test
    public void stoneToKg() {
        KgConversions testConverter = new KgConversions();

        assertEquals(6.35, testConverter.stoneToKg(14,0.45359237), 0);
    }

    @Test
    public void ounceToKg() {
        KgConversions testConverter = new KgConversions();

        assertEquals(0.03, testConverter.ounceToKg(0.0625,0.45359237), 0);
    }

    @Test
    public void stonesAndOuncesToKg(){
        KgConversions testConverter = new KgConversions();

        assertEquals(72.57, testConverter.stonesAndOuncesToKg(11,6, 0.45359237), 0);
    }

    @Test
    public void drachmToKg() {
        KgConversions testConverter = new KgConversions();

        assertEquals(0, testConverter.drachmToKg(0.00390625,0.45359237), 0);
    }

    @Test
    public void grainToKg() {
        KgConversions testConverter = new KgConversions();

        assertEquals(0, testConverter.grainToKg(0.00014285714,0.45359237), 0);
    }
}
