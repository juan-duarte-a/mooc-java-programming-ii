
import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand> {
    
    private final List<Card> hand;
    
    public Hand () {
        hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        hand.forEach(System.out::println);
    }
    
    public void sort() {
        hand.sort(Card::compareTo);
    }
    
    private int handValue() {
        return hand.stream().mapToInt(Card::getValue).sum();
    }
    
    public void sortBySuit() {
        hand.sort(new BySuitInValueOrder());
    }
    
    @Override
    public int compareTo(Hand hand) {
        return this.handValue() - hand.handValue();
    }
    
}
