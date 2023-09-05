public class Container {
    
    private int amountOfLiquid;
    public final static int MAX_CAPACITY = 100;

    public int contains() {
        return amountOfLiquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            amountOfLiquid = Math.min(amountOfLiquid + amount, MAX_CAPACITY);
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            amountOfLiquid = Math.max(amountOfLiquid - amount, 0);
        }
    }
    
    @Override
    public String toString() {
        return amountOfLiquid + "/" + MAX_CAPACITY;
    }
}
