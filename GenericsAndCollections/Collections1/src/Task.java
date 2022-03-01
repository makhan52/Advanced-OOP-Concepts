import java.util.*;

public class Task {
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:" + hand);
        System.out.println("Cards add:" + addCards(hand));

        for (Card card : d)
            System.out.println(card);
    }
    public static int addCards(ArrayList<Card> hand) {
        int sum = 0;
        for (Card card : hand) {
            if (card.getValue().equals("Ace"))
                sum += 1;
            else if (card.getValue().equals("Jack"))
                sum += 11;
            else if (card.getValue().equals("Queen"))
                sum += 12;
            else if (card.getValue().equals("King"))
                sum += 13;
            else if (card.getValue() instanceof Integer)
                sum += (Integer) card.getValue();
        }
        return sum;
    }
}