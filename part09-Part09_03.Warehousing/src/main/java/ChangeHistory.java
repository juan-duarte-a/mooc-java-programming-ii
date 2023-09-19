
import java.util.ArrayList;

public class ChangeHistory {
    
    private final ArrayList<Double> history = new ArrayList<>();
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        return history.stream().max(Double::compare).orElse(0d);
    }
    
    public double minValue() {
        return history.stream().min(Double::compare).orElse(0d);
    }
    
    public double average() {
        return history.stream().mapToDouble(Double::valueOf).average().orElse(0d);
    }
    
}
