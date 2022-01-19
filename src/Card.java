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
        setFaceName(faceName);
        setSuit(suit);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method will validate if the argument is a valid face name
     * @param faceName - i.e. "2", "3", ..."jack", "queen","king","ace"
     */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();

        if (getValidFaceNames().contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are: "+getValidFaceNames());
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

    /**
     * This method returns a list of the valid face names on regular playing cards
     * @return
     */
    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    @Override
    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }

    /**
     * This method will return the value of the card assuming that ace's are high
     * 2=2, 3=3, 4=4 ...10=10, jack=11, queen=12, king=13, ace=14
     *
     * getValidFaceNames = "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     * index position       0   1   2   3   4   5   6   7   8     9      10      11     12
     */
    public int getCardValue()
    {
        return getValidFaceNames().indexOf(faceName)+2;
    }
}
