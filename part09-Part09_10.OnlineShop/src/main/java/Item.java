public class Item {
    
    private final String product;
    private int qty;
    private final int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return unitPrice * qty;
    }
    
    public void increaseQuantity() {
        qty++;
    }

    public String getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return product + ": " + qty;
    }
    
}
