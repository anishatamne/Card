# Card
# Card Deck Java Program

## 📌 Overview
This is a **menu-driven Java program** that simulates a deck of **52 playing cards**.  
The program provides various operations such as printing the deck, finding specific cards, shuffling, and dealing random cards.

## 📂 Project Structure
The project consists of three Java files:

1. **Card.java** – Defines the `Card` class.
2. **CardOperations.java** – Implements all deck operations.
3. **Main.java** – Provides a user-friendly menu-driven interface.

---

## 🚀 Features
✅ Create a **deck of 52 cards**  
✅ Print **entire deck** or a **specific card**  
✅ Find cards of the **same suit** or **same rank**  
✅ Search for a **specific card**  
✅ **Shuffle** the deck randomly  
✅ **Deal 5 random cards**  

---

## Methods in `CardOperations.java`

| Method Name       | Description |
|------------------|------------|
| `createDeck()`   | Creates a deck of 52 cards. |
| `printDeck()`    | Prints all cards in the deck. |
| `printCard(int index)` | Prints a specific card based on index (0-51). |
| `sameCard(String suit)` | Prints all cards of the given suit. |
| `compareCard(String rank)` | Prints all cards of the given rank. |
| `findCard(String suit, String rank)` | Searches for a particular card in the deck. |
| `dealCard()` | Prints 5 random cards from the deck. |
| `shuffleDeck()` | Randomizes the order of cards in the deck. |

## Menu Options in Main.java
--- Menu ---
1. Print Deck
2. Print a Card
3. Cards of Same Suit
4. Cards of Same Rank
5. Find a Card
6. Deal 5 Cards
7. Shuffle Deck
8. Exit


---

## 🎮 How to Run
1. **Clone the repository**:
   ```sh
   git clone https://github.com/yourusername/Card_Deck.git
