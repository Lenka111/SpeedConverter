/*
* @EVoinu
*
* */

public class SpeedConverter {

    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0 )
            return -1;
        //double milesPerHour = kilometersPerHour * 0.621371192237;
        return Math.round(kilometersPerHour * 0.6223);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0)

            System.out.println("Invalid Value ");
        else

            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour)+ " mi/h");

    }


    public static void main(String[] args) {
      //  System.out.println(toMilesPerHour(1.5));
       printConversion(95.75);

    }
}