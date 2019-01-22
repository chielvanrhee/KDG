package Week3.dagen;

import java.util.Calendar;
import java.util.Scanner;

public class dagen {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int daynumber = 0;


        //getting input
        System.out.print("gimme a day, small text only: ");
        String userInput = keyboard.nextLine();
        switch (userInput) {
            case "monday":
                daynumber = 1;
                break;
            case "tuesday":
                daynumber = 2;
                break;
            case "wednesday":
                daynumber = 3;
                break;
            case "thursday":
                daynumber = 4;
                break;
            case "friday":
                daynumber = 5;
                break;
            case "saturady":
                daynumber = 6;
                break;
            case "sunday":
                daynumber = 7;
                break;

            default:
                System.out.println("wrong entry, make sure to use only small letters next time");
        }
        System.out.println("that means that the daynumber is " + daynumber);

// printing cuurent day
        final int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        String dayName = "undefined";
        switch (dayOfWeek) {
            case 2:
                dayName = "monday";
                break;
            case 3:
                dayName = "tuesday";
                break;
            case 4:
                dayName = "wednesday";
                break;
            case 5:
                dayName = "thursday";
                break;
            case 6:
                dayName = "friday";
                break;
            case 7:
                dayName = "saturday";
                break;
            case 1:
                dayName = "sunday";
                break;

            default:
                System.out.println("something went worng :(");
        }
        System.out.println("the current day is " + dayName);
    }
}
