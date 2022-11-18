//taha burak sahin
//Invoking Math.random() returns a (pseudo)random number of type double from
//the half-open interval [0, 1). Use this generator to draw one card from a standard
//deck. First, draw an integer from the interval [1, 4] (corresponding to suit: clubs,
//diamonds, hearts, spades) and then another number from the interval [2, 14] (deuce,
//trey, four, five, . . . , ten, Jack, Queen, King, Ace). Using the switch instruction,
//define a string describing the card and display it on the console;

package task4;
import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};

        int randNum = (int) (Math.random() * 13);
        int randSuit = (int) (Math.random() * 4);
        String chosenSuit = suit[randSuit];
        String chosenNum = cards[randNum] ;
        System.out.println("Your card is " + chosenNum + " of " + chosenSuit);
    }
}

