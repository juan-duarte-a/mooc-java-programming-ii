public class Book {

    private final String name;
    private final int recommendedAge;

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return name;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }
    
    @Override
    public String toString() {
        return name + " (" + "recommended for " 
                + recommendedAge + " years-olds or older)";
    }
    
}
