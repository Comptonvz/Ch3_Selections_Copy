package PA6_IfElseIf.src.main.java;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors:");
        int userChoice = input.nextInt();
        
        double computerChoice = Math.random();
        int computerInt = 0;
        if (computerChoice < 0.33) {
            computerInt = 1; // Rock
        } else if (computerChoice < 0.67) {
            computerInt = 2; // Paper
        } else {
            computerInt = 3; // Scissors
        }
        
            System.out.print("The computer chose ");
        if (computerInt == 1) {
            System.out.print("Rock.");
        } else if (computerInt == 2) {
            System.out.print("Paper.");
        } else {
            System.out.print("Scissors.");
        }
        
        System.out.print(" You are ");
        if (userChoice == 1) {
            System.out.print("Rock.");
        } else if (userChoice == 2) {
            System.out.print("Paper.");
        } else {
            System.out.print("Scissors.");
        }
        
      
        
        if (userChoice == computerInt) {
            System.out.println(" It's a tie!");
        } else if (userChoice == 1 && computerInt == 3 || 
                   userChoice == 2 && computerInt == 1 || 
                   userChoice == 3 && computerInt == 2) {
            System.out.println(" You won!");
        } else {
            System.out.println(" You lost!");
        }
    }
}