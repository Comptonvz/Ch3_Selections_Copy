package PA5_IfStatements.src.main.java;

public class RandomMonth {
    public static void main(String[] args) {
        int monthNumber = (int) (Math.random() * 12) + 1;
        String monthName = "";
        
        if (monthNumber == 1) {
            monthName = "January";
        } else if (monthNumber == 2) {
            monthName = "February";
        } else if (monthNumber == 3) {
            monthName = "March";
        } else if (monthNumber == 4) {
            monthName = "April";
        } else if (monthNumber == 5) {
            monthName = "May";
        } else if (monthNumber == 6) {
            monthName = "June";
        } else if (monthNumber == 7) {
            monthName = "July";
        } else if (monthNumber == 8) {
            monthName = "August";
        } else if (monthNumber == 9) {
            monthName = "September";
        } else if (monthNumber == 10) {
            monthName = "October";
        } else if (monthNumber == 11) {
            monthName = "November";
        } else if (monthNumber == 12) {
            monthName = "December";
        }
        
        System.out.println(monthName);
    }
}