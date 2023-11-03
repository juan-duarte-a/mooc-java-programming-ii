
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card card1, Card card2) {
        return (card1.getSuit().ordinal() * 100 + card1.getValue())
                - (card2.getSuit().ordinal() * 100 + card2.getValue());
    }

}
