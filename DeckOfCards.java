package Day12;


import java.util.Random;
    public class DeckOfCards {
        static String[] Clubs = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        static String[] Diamonds = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        static String[] Hearts = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        static String[] Spades = {"2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King", "Ace"};

        static String[][] deck = {Clubs, Diamonds, Hearts, Spades};
        static String[][] newDeck;

        public static void distribute() {

           for (int i = 1; i < 5; i++) {
            System.out.println("For Player" + i);
            for (int j = 1; j < 10; j++) {
                selectCard();
            }

        }
    }

        public static void selectCard() {
            Random c = new Random();
            int suit = c.nextInt(4);
            int rank = c.nextInt(13);
            if (newDeck[suit][rank] == null) {
                selectCard();
            } else {
                System.out.println(newDeck[suit][rank]);
                newDeck[suit][rank] = null;
            }
        }

        public static void main (String[] args) {
            System.out.println("Welcome to Cards Game");
            distribute();
        }
    }

