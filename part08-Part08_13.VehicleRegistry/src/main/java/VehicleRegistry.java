
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (owners.containsKey(licensePlate))
            return false;
        
        owners.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        return owners.remove(licensePlate) != null;
    }
    
    public void printLicensePlates() {
        owners.keySet().forEach(System.out::println);
    }
    
    public void printOwners() {
        owners.values().stream().distinct().forEach(System.out::println);
    }
    
}
