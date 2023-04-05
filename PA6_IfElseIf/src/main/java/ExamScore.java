package PA6_IfElseIf.src.main.java;

import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your exam score: ");
        int score = input.nextInt();
        
        String letterGrade;
        String message;
        
        if (score >= 90) {
            letterGrade = "A";
            message = "Excellent job!";
        } else if (score >= 80) {
            letterGrade = "B";
            message = "Great work!";
        } else if (score >= 70) {
            letterGrade = "C";
            message = "You passed.";
        } else if (score >= 60) {
            letterGrade = "D";
            message = "Let's prepare more next time.";
        } else {
            letterGrade = "F";
            message = "Come to get help.";
        }
        
        System.out.printf("You earned a %s! %s\n", letterGrade, message);
    }
}