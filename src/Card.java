import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * This class will contain information about each card
 */
public class Card implements Comparable<Card> {
  final private int value;
  final private String suit;


  /**
   * Constructor for a card, it assigns the suit and the value
   * @param value - a number between 2 and 14 representing the value of the card
   * @param suit - the suit of this card
   * @throws IllegalArgumentException - if the suit is invalid or the value is invalid
   */
  public Card(int value, String suit) {
    // initialize the set of suits (probably could go in the main game class

    // making sure that plural or not plural and case doesn't matter
    if (PokerGame.getSuits().contains(suit.toLowerCase().trim())) this.suit = suit;
    else if (PokerGame.getSuits().contains(suit.toLowerCase().trim() + "s")) this.suit = suit + "s";
    else throw new IllegalArgumentException("Invalid suit");

    // assign the value for the card, if it's an ace, then inputting 1 or 14 doesn't matter
    if (value >= 2 && value <= 14) {this.value = value;}
    else if (value == 1) {this.value = 14;}
    else throw new IllegalArgumentException("Invalid value");

  }

  /**
   * Represents this card with a string
   * @return a string representing this card "[name] of [suit]"
   */
  @Override
  public String toString() {
    String prefix;

    if (value == 11) prefix = "Jack";
    else if (value == 12) prefix = "Queen";
    else if (value == 13) prefix = "King";
    else if (value == 14) prefix = "Ace";
    else {prefix = Integer.toString(value);}

    return prefix + " of " + suit;
  }

  /**
   * This method compares 2 card objects using their values
   * @param other card being compared to.
   * @return negative number if value is less than, postive number if value is greater than, 0 if
   * equal
   * value
   */
  @Override
  public int compareTo(Card other) {
    return this.value - other.value;
  }
}
