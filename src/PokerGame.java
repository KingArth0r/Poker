import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

/**
 * This class will run the poker game
 */
public class PokerGame {
  private Set<Card> deck; // the deck of cards for the game that will change
  private static final Set<String> suits = new HashSet<>(Arrays.asList("hearts", "diamonds",
          "spades", "clubs")); // the unchanging set of suits for each card
  private int pot;
  private int playerTurn;


  /**
   * Accessor method for the suits variable
   * @return the set of suits
   */
  public static Set<String> getSuits() {return suits;}

  /**
   * Initialize the deck by looping through each suit and value within the suit
   */
  public void initializeDeck() {
    deck = new HashSet<>();
    for (String suit : suits) {
      for (int i = 1; i < 14; i++) {
        deck.add(new Card(i, suit));
      }
    }
    List<Card> sortedDeck = new ArrayList<>(deck);
    Collections.sort(sortedDeck);

  }

  /**
   * Print the current deck
   */
  public void printDeck() {
    for (Card card : deck) {
      System.out.println(card);
    }
    System.out.println();
  }

  /**
   * This constructor will run the poker game for now.
   */
  public PokerGame() {
    initializeDeck();
    pot = 0;
    Player player = new Player();
    player.addBalence(100);
    System.out.println(player);
  }

  /**
   * This will run a new instance of a PokerGame
   * @param args - unused
   */
  public static void main(String[] args) {
    new PokerGame();
  }
}
