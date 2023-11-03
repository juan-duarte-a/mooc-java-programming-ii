
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("literacy.csv"))) {
            lines.map(line -> line.split(","))
                    .map(line -> new LiteracyLevel(
                            line[3], 
                            Integer.parseInt(line[4]), 
                            line[2].trim().startsWith("male") ? 
                                    LiteracyLevel.Gender.MALE :
                                    LiteracyLevel.Gender.FEMALE, 
                            Double.parseDouble(line[5])))
                    .sorted(LiteracyLevel::compareTo)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
