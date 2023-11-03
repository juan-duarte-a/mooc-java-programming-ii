
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFilesPerLine {

    public static List<String> read(String file) {
        List<String> lines = new ArrayList<>();
        
        try (Stream<String> fileStream = Files.lines(Paths.get(file))) {
            lines = fileStream.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return lines;
    }

}
