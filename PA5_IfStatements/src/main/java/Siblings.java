package PA5_IfStatements.src.main.java;

import java.util.Scanner;
public class Siblings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many siblings do you have? ");
        int numSiblings = input.nextInt();
        
        if (numSiblings == 0) {
            System.out.println("You are an only child.");
        } else {
            System.out.print("How many brothers do you have? ");
            int numBrothers = input.nextInt();
            System.out.print("How many sisters do you have? ");
            int numSisters = input.nextInt();
            System.out.printf("You have %d brothers and %d sisters.\n", numBrothers, numSisters);
        }
    }
}