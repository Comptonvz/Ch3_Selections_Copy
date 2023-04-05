package PA7_SwitchStatements.src.main.java;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card from the deck (e.g. QS for Queen of Spades): ");
        String cardSymbol = input.nextLine().toUpperCase();
        
        String rankSymbol = cardSymbol.substring(0, 1);
        String suitSymbol = cardSymbol.substring(1);
        String rank, suit;
        
        switch (rankSymbol) {
            case "A":
                rank = "Ace";
                break;
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "J":
                rank = "Jack";
                break;
            case "Q":
                rank = "Queen";
                break;
            case "K":
                rank = "King";
                break;
            default:
                rank = "Invalid rank";
                break;
        }
        
        switch (suitSymbol) {
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            case "S":
                suit = "Spades";
                break;
            default:
                suit = "Invalid suit";
                break;
        }
        
        if (rank.equals("Invalid rank") || suit.equals("Invalid suit")) {
            System.out.println("Invalid card symbol");
        } else {
            System.out.println(rank + " of " + suit);
        }
    }
}