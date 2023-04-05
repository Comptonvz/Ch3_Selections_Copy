package PA5_IfStatements.src.main.java;

import java.util.Scanner;

public class QuadraticFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();
        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();
        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();
        
        double formula = b*b - 4*a*c;
        
        if (formula > 0) {
            double root1 = (-b + Math.sqrt(formula)) / (2*a);
            double root2 = (-b - Math.sqrt(formula)) / (2*a);
            System.out.printf("Real root one: %.2f\nReal root two %.2f\n", root1, root2);
        } else if (formula == 0) {
            double root = -b / (2*a);
            System.out.printf("There is one real root: %.2f\n", root);
        } else {
            System.out.println("There are no real roots.");
        }
    }
}