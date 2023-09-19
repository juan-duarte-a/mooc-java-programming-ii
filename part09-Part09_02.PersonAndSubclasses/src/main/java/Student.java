public class Student extends Person {
    
    private int credits;

    public Student(String name, String direction) {
        super(name, direction);
    }
    
    public void study() {
        credits++;
    }
    
    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Student credits " + credits;
    }
    
}
