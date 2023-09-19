
import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    
    private final List<Packable> packables;
    private final double capacity;

    public Box(double capacity) {
        this.packables = new ArrayList<>();
        this.capacity = capacity;
    }
    
    public void add(Packable packable) {
        if (canBeBoxed(packable)) {
            packables.add(packable);
        }
    }
    
    private boolean canBeBoxed(Packable packable) {
        return capacity - weight() >= packable.weight();
    }
    
    @Override
    public double weight() {
        return this.packables
                .stream()
                .mapToDouble(p -> p.weight())
                .sum();
    }

    @Override
    public String toString() {
        return "Box: " + packables.size() 
                + " items, total weight " 
                + weight() + " kg";
    }
    
}
