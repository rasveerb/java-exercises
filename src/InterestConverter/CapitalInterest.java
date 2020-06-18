package InterestConverter;

public class CapitalInterest {

    double capital = 100;
    double interest = 2.3;
    int years;

    public static double interestCalculator(double capital, double interest, int years){
        double total;

        double interestRate = 1 + 0.01 * interest;

        double yearInterest = Math.pow(interestRate, years);

        double actualInterest = capital * yearInterest;

        double roundedInterest = (double) Math.round(actualInterest * 100) / 100;

        return(roundedInterest);

    }

    public static void main(String[] args){}
}
