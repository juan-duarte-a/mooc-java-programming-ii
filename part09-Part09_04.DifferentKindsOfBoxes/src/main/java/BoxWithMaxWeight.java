
import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {
    
    private final int capacity;
    private int usedCapacity;
    private final List<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (capacity - usedCapacity >= item.getWeight()) {
            items.add(item);
            usedCapacity += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}
