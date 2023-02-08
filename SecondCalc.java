import java.util.Scanner;
public class SecondCalc {
    public static void main(String [] args){
// Get number of seconds from user //
        System.out.print("How many seconds?");
        Scanner  input = new Scanner(System.in);
        double secs = input.nextInt();
// Get number of hours and standalone decimal value from divided ans //
        int FlatHours = (int) (secs / 3600);
        double DecimalHours = secs / 3600;
// Multiply the decimal value of seconds divided by 3600 by 60 to get the number of minutes //
        double DecimalMinutes = ((DecimalHours - FlatHours) * 60);
        int FlatMinutes = (int) ((DecimalHours - FlatHours) * 60);
// Finally subtract the decimal amount from the amount of minutes, and multiply that amount by 60 to get the number of seconds.//
        int seconds = (int) ((DecimalMinutes - FlatMinutes)*60);

        System.out.println("Your time is" + FlatHours + "hours," + FlatMinutes + "minutes,and" + seconds + "seconds.");












    }
    }

