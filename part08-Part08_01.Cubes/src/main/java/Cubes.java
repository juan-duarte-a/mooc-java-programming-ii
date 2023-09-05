
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String input;
        
        do {
            input = scanner.next();
            if (!input.equalsIgnoreCase("end")) {
                int cube = Integer.parseInt(input);
                System.out.println(cube * cube * cube);
            } else {
                break;
            }
        } while (true);
    }
}
