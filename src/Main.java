import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //We are instantiating a Scanner object
        //This will create a Scanner object in the system (computer) memory
        //we can access that object by calling the variable name - which is "keyboard" in this case
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Enter your name:");
//        String name = keyboard.nextLine();
//        System.out.printf("Hello %s%n",name);

        //creating Card objects
        Card aceOfSpades = new Card("ace","spades");
        Card jaretsCrazyCard = new Card("3","hearts");

        System.out.printf("%s has a value of %d%n",aceOfSpades, aceOfSpades.getCardValue());
        System.out.printf("%s has a value of %d%n",jaretsCrazyCard, jaretsCrazyCard.getCardValue());

        DeckOfCards deck = new DeckOfCards();

        System.out.println("--------Deck after calling the constructor--------");
        for (int i=1; i<=52 ; i++)
            System.out.println(deck.dealTopCard());

        DeckOfCards deck2 = new DeckOfCards();

        deck2.shuffle();
        System.out.println("--------Deck after calling shuffle()--------");
        for (int i=1; i<=52 ; i++)
            System.out.println(deck2.dealTopCard());
    }
}
