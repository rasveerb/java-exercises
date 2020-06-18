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

//    A capital of £ 100 is invested at a fixed interest rate of 2.3 per cent.
//    The interest is added to the capital at the end of each year.
//    Use the formula
//            total = capital ∗ (1 + 0.01 ∗ interest rate)^years
//    print the balance after each of the first 5 years
//    and after 500 years.

    public static void main(String[] args){
System.out.println(interestCalculator(100, 2.3, 5));
    }
}
