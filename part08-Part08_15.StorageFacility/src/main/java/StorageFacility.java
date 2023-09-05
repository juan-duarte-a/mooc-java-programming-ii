
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> units = new HashMap<>();
    
    public void add(String unit, String item) {
        units.putIfAbsent(unit, new ArrayList<String>());
        units.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<String>());
    }
    
    public void remove(String storageUnit, String item) {
        units.get(storageUnit).remove(item);
        if (units.get(storageUnit).isEmpty()) {
            units.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        return units.entrySet().stream()
                .filter(entry -> !entry.getValue().isEmpty())
                .map(entry -> entry.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
    }
    
}
