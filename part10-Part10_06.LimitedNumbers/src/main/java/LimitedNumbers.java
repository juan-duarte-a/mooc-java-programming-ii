
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.parseInt(scanner.next());
            
            if (input < 0) {
                break;
            }
            
            numbers.add(input);
        }
        
        numbers.stream().filter(n -> n >= 1 && n <= 5).forEach(System.out::println);
    }
}
