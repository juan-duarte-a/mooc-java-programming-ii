public class Person {
    
    private String name;
    private String direction;

    public Person(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }
    
    @Override
    public String toString() {
        return name + "\n  " + direction;
    }
}
