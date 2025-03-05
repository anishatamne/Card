
// CardOperations.java - Manages deck and card-related operations
import java.util.*;

public class CardOperations {
    private ArrayList<Card> deck;
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Constructor that initializes and creates the deck
        public CardOperations() {
            createDeck();
        }

        // a) Creates a deck of 52 cards
        public void createDeck() {
            deck = new ArrayList<>();
            for (String suit : SUITS) {
                for (String rank : RANKS) {
                    deck.add(new Card(suit, rank));
                }
            }
        }


    // b) Prints all cards in the deck
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }





}