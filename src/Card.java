import java.util.Arrays;
import java.util.List;

public class Card {
    private String faceName, suit;

    /**
     * This is a constructor.  It is different from a method for 2 reasons:
     * 1.  no return type
     * 2.  The name is the class name (including the upper case first letter)
     * @param faceName
     * @param suit
     */
    public Card(String faceName, String suit) {
        this.faceName = faceName;
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will validate that the argument is one of the valid suits (hearts, spades, clubs,
     * diamonds") and set the instance variable accordingly.
     * @param suit
     */
    public void setSuit(String suit) {
        //make sure what ever way the argument was passed in, we convert it to lower case
        suit = suit.toLowerCase();

        if (getValidSuits().contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Valid suits are: "+getValidSuits());
    }

    /**
     * This is a "static" method, which means that it can be called without an instance of the
     * Card class
     * It returns a list with all the valid suits
     * @return
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("spades","clubs","hearts","diamonds");
    }

    @Override
    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
}
