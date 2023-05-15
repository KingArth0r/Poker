import java.util.Set;
import java.util.HashSet;

/**
 * This object will contain data and methods regarding each player
 */
public class Player {
  private Set<Card> hand;
  private int balance;

  /**
   * Player object constructor initializes the hand to an empty set and balance is set to 0
   */
  public Player() {
    hand = new HashSet<>();
    balance = 0;
  }

  /**
   * Mutator method which adds money to this player's balance, can also be used to take away money
   * TODO: Figure out how to make sure other players can't access this method
   */
  public void addBalence(int toAdd) {
    balance += toAdd;
  }

  /**
   * Method that creates a String which represents the data about the player
   * @return string the represents the current player information
   */
  @Override
  public String toString() {
    String result = "HAND:\n";
    if (hand != null) {
      for (Card card : hand) {
        if (card != null) result += card + "\n";
      }
    }
    result += "BALENCE: $" + balance;
    return result;
  }
}
