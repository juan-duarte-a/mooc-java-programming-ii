
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private final List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void add(String product, int price) {
        if (items.stream().anyMatch(i -> i.getProduct().equals(product))) {
            items.stream()
                    .filter(i -> i.getProduct().equals(product))
                    .findFirst()
                    .ifPresent(i -> i.increaseQuantity());
        } else {
            items.add(new Item(product, 1, price));
        }
    }
    
    public int price() {
        return items.stream().mapToInt(i -> i.price()).sum();
    }
    
    public void print() {
        items.forEach(System.out::println);
    }

}
