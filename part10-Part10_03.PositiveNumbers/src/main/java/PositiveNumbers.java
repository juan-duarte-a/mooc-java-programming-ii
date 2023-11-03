
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[] {1, 2, 4, -4, -3, -2, 1}));
        System.out.println(positive(numbers));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(n -> n > 0).collect(Collectors.toList());
    }

}
