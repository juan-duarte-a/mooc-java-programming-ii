
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int count = 0;
        
        while(true) {
            double value = scanner.nextDouble();
            if (value == 0) {
                break;
            }
            
            if (value > 0) {
                total += value;
                count++;
            }
        }
        
        if (total == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(total/count);
        }
    }
}
