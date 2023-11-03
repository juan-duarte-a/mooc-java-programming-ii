public class LiteracyLevel implements Comparable<LiteracyLevel> {
    
    public enum Gender {MALE, FEMALE};
    
    private final String country;
    private final int year;
    private final Gender gender;
    private final double literacyRate;

    public LiteracyLevel(String country, int year, Gender gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public Gender getGender() {
        return gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }
    
    @Override
    public int compareTo(LiteracyLevel literacyLevel) {
        return Double.compare(this.literacyRate, literacyLevel.literacyRate);
    }
    
    @Override
    public String toString() {
        return country + " ("
                + year + "), "
                + gender.toString().toLowerCase() +", "
                + literacyRate;
    }
    
}
