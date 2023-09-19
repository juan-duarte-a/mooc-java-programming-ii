
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private final Map<String, Integer> productStock;
    private final Map<String, Integer> productPrice;
    
    public Warehouse() {
        productStock = new HashMap<>();
        productPrice = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }
    
    public int price(String product) {
        return productPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stock(product) > 0) {
            productStock.put(product, stock(product) - 1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        return productPrice.keySet();
    }
    
}
