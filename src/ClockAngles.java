/* This class will calculate the angle between two analog clock hands at any given time. */
public class ClockAngles {

    public static double clockwiseAngles (int hour, int minutes){
        double hourAngle = (hour * 30);
        double minuteAngle = (minutes * 6);

        return (hourAngle - minuteAngle);
    }

    public static  double anticlockwiseAngles (int hour, int minutes){
        return(0);
    }

    public static void main (String[] args){

        System.out.println(clockwiseAngles(3,0));

        System.out.println(clockwiseAngles(9,0));

        System.out.println(clockwiseAngles(6,30));

        System.out.println(clockwiseAngles(12,15));

        System.out.println(clockwiseAngles(12,45));

    }
}
