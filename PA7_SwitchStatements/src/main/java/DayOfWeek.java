package PA7_SwitchStatements.src.main.java;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year, month, day, startDayOfYear;
        
        System.out.println("Day Codes: 0 sun, 1 mon, 2 tue, 3 wed, 4 thu, 5 fri , 6 sat "); 

        System.out.print("Enter year: ");
        year = scan.nextInt();

        System.out.print("Enter month (1-12): ");
        month = scan.nextInt();

        System.out.print("Enter day (1-31): ");
        day = scan.nextInt();

        System.out.print("Enter day of January 1st (0-6): ");
        startDayOfYear = scan.nextInt();

        int dayOfYear = 0; //6

        if (month == 1) {
            dayOfYear = day;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //checks for leap year... 
                dayOfYear = 31 + 29 + day;
            } else {
                dayOfYear = 31 + 28 + day;
            }
        } else if (month == 3) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                dayOfYear = 31 + 29 + 31 + day;
            } else {
                dayOfYear = 31 + 28 + 31 + day;
            }
        } else if (month == 4) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                dayOfYear = 31 + 29 + 31 + 30 + day;
            } else {
                dayOfYear = 31 + 28 + 31 + 30 + day;
            }
        } else if (month == 5) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                dayOfYear = 31 + 29 + 31 + 30 + 31 + day;
            } else {
                dayOfYear = 31 + 28 + 31 + 30 + 31 + day;
            }
        } else if (month == 6) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + day;
            } else {
                dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + day;
            }
        } else if (month == 7) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // leap year
                dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
            } else {
                dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
            } 
        } else if (month == 8) {
       if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
           dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
       } else {
           dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
       }
         } else if (month == 9) {
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                 dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
             } else {
                 dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
             }
         } else if (month == 10) {
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                 dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
             } else {
                 dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
             }
         } else if (month == 11) {
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                 dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
             } else {
                 dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
             }
         } else if (month == 12) {
             if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                 dayOfYear = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + day;
             } else {
                 dayOfYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 + day;
             }
         }

        int dayOfWeek = (dayOfYear + startDayOfYear) % 7;

        String dayOfWeekString = "";
        switch (dayOfWeek) {
            case 0:
                dayOfWeekString = "Sunday";
                break;
            case 1:
                dayOfWeekString = "Monday";
                break;
            case 2:
                dayOfWeekString = "Tuesday";
                break;
            case 3:
                dayOfWeekString = "Wednesday";
                break;
            case 4:
                dayOfWeekString = "Thursday";
                break;
            case 5:
                dayOfWeekString = "Friday";
                break;
            case 6:
                dayOfWeekString = "Saturday";
                break;
        }

        System.out.println("The day of the week is " + dayOfWeekString + ".");
    }
}



///wont work good