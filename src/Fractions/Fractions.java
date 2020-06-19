package Fractions;/* A class which calculates the addition and multiplication of fractions.*/

public class Fractions {
    int numerator1;
    int denominator1;
    //below = positive ints only - TODO: put in check for this
    int numerator2;
    int denominator2;

    public static String fractionSum(int numerator1, int denominator1, int numerator2, int denominator2) {
        int sumFractionTop = (((numerator1 * denominator2)+(denominator1 * numerator2)));
        int sumFractionBottom = ((denominator1 * denominator2));

        String total = sumFractionTop + "/" + sumFractionBottom;

        return total;
    }

    public static String fractionProduct(int numerator1, int denominator1, int numerator2, int denominator2){
        int productFractionTop = (numerator1 * numerator2);
        int productFractionBottom = (denominator1 * denominator2);

        String total = productFractionTop + "/" + productFractionBottom;

        return total;
    }

    public static void main(String[] args){}

}
