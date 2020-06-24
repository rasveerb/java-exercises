package KgConverter;
/* This class takes imperial measurements and converts them into Kilograms*/
public class KgConversions {

    public static double tonToKg(double tons, double kg){
        double weight = (tons * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return(roundedWeight);
    }

    public static double hundredWeightToKg(double hundredWeights, double kg){
        double weight = (hundredWeights * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return(roundedWeight);
    }

    public static double quarterToKg(double quarters, double kg){
        double weight = (quarters * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return(roundedWeight);
    }

    public static double stoneToKg(double stones, double kg){
        double weight = (stones * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return(roundedWeight);
    }

    public static double ounceToKg(double ounces, double kg){
        double weight = (ounces * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return (roundedWeight);
    }

    public static double stonesAndOuncesToKg(double stones, double pounds, double kg){
        double totalPounds = ((stones * 14)+pounds);

        double weight = (totalPounds * kg );

        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return (roundedWeight);
    }

    public static double drachmToKg(double drachms, double kg){
        double weight = (drachms * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return (roundedWeight);
    }

    public static double grainToKg(double grains, double kg){
        double weight = (grains * kg);
        double roundedWeight = (double) Math.round(weight * 100) / 100;

        return (roundedWeight);
    }

    public static void main(String[] args){
    }
}
