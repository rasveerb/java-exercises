/* This class takes imperial measurements and converts them into Kilograms*/
public class KgConversions {
    double kg = 0.45359237;

    public static double tonToKg(double kg){
        double ton = 2240;
        return(ton * kg);
    }

    public static double hundredWeightToKg(double kg){
        double hundredWeight = 112;
        return(hundredWeight * kg);
    }

    public static double quarterToKg(double kg){
        double quarter = 28;
        return(quarter * kg);
    }

    public static double stoneToKg(double kg){
        double stone = 14;
        return(stone * kg);
    }

    public static double ounceToKg(double kg){
        double ounce = 0.0625;
        return (ounce * kg);
    }

    public static double drachmToKg(double kg){
        double drachm = 0.00390625;
        return (drachm * kg);
    }

    public static double grainToKg(double kg){
        double grain = 0.00014285714;
        return (grain * kg);
    }

    public static void main(String[] args){
    }
}
