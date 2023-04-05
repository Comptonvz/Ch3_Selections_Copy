package PA5_IfStatements.src.main.java;
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        System.out.print("Enter third integer: ");
        int c = input.nextInt();
        
        int smallest, middle, largest;
        
        // find the smallest integer
        if (a < b && a < c) {
            smallest = a;
            if (b < c) {
                middle = b;
                largest = c;
            } else {
                middle = c;
                largest = b;
            }
        } else if (b < a && b < c) {
            smallest = b;
            if (a < c) {
                middle = a;
                largest = c;
            } else {
                middle = c;
                largest = a;
            }
        } else {
            smallest = c;
            if (a < b) {
                middle = a;
                largest = b;
            } else {
                middle = b;
                largest = a;
            }
        }
        
        System.out.printf("Order ascending order: %d, %d, %d\n", smallest, middle, largest);
    }
}