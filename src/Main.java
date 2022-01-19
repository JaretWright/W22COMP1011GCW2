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
        Card jaretsCrazyCard = new Card("2","hearts");

        System.out.println(aceOfSpades.getFaceName() + " of " + aceOfSpades.getSuit());
        aceOfSpades.setSuit("Clubs");
        System.out.println(aceOfSpades);
//        aceOfSpades.setSuit("professors");
        System.out.println(jaretsCrazyCard);

        System.out.printf("The value of %s is %d%n",aceOfSpades,aceOfSpades.getCardValue());
        aceOfSpades.setFaceName("8");
        System.out.printf("The value of %s is %d%n",aceOfSpades,aceOfSpades.getCardValue());
    }
}
