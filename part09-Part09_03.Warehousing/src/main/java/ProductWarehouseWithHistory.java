public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private final ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    @Override
    public final void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        changeHistory.add(getBalance());
        return result;
    }
    
    public String history() {
        return changeHistory.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: " + changeHistory.average());
    }
    
}
