
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputParts = input.split(" ");
            int amount = Integer.parseInt(inputParts[1]);
            
            if (inputParts[0].equals("add")) {
                firstContainer.add(amount);
            } else if (inputParts[0].equals("move")) {
                secondContainer.add(Math.min(firstContainer.contains(), amount));
                firstContainer.remove(amount);
            } else if (inputParts[0].equals("remove")) {
                secondContainer.remove(amount);
            }
        }
    }

}
