public class MisplacingBox extends Box {

    @Override
    public void add(Item item) {
        // Item "added" ;)
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
