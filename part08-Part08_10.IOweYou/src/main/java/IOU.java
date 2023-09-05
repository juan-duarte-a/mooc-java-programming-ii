
import java.util.HashMap;

public class IOU {
    
    private HashMap<String, Double> ious = new HashMap<>();
    
    public void setSum(String toWhom, double amount) {
        ious.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return ious.getOrDefault(toWhom, 0d);
    }
}
