
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        herd = new ArrayList<>();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        herd.forEach(o -> sb.append(o).append("\n"));
        return sb.toString();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        herd.forEach(o -> o.move(dx, dy));
    }
    
}
