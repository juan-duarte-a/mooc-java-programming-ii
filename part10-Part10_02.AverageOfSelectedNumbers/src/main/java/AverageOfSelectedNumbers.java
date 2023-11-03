
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            inputs.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        
        double average = 0;
        if (input.equalsIgnoreCase("n")) {
            average = inputs.stream().mapToInt(Integer::valueOf).filter(n -> n < 0).average().orElse(0);
            System.out.println("Average of the negative numbers: " + average);
        } else {
            average = inputs.stream().mapToInt(Integer::valueOf).filter(n -> n > 0).average().orElse(0);
            System.out.println("Average of the positive numbers: " + average);
        } 

    }
}
