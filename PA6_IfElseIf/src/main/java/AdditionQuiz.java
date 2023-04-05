package PA6_IfElseIf.src.main.java;

import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lower, upper;
        
        // Prompt user for lower and upper limits
        System.out.print("Enter lower limit for range of values: ");
        lower = input.nextInt();
        System.out.print("Enter upper limit for range of values: ");
        upper = input.nextInt();
        
        // Generate two random integers within the specified range
        Random rand = new Random();
        int num1 = rand.nextInt(upper - lower + 1) + lower;
        int num2 = rand.nextInt(upper - lower + 1) + lower;
        
        // Display addition problem to user and prompt for answer
        System.out.print("What is " + num1 + "+" + num2 + "=");
        int answer = input.nextInt();
        
        // Check if answer is correct and display appropriate message
        if (answer == num1 + num2) {
            System.out.println("Correct answer! Great job!");
        } else {
            System.out.println("Incorrect answer. Better luck next time.");
        }
    }
}