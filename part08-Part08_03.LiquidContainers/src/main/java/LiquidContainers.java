
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        final int MAX = 100;

        while (true) {
            System.out.println("First: " + firstContainer + "/" + MAX);
            System.out.println("Second: " + secondContainer + "/" + MAX);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] command = input.split(" ");
            int value = Integer.parseInt(command[1]);
            value = value < 0 ? 0 : value;
            
            switch (command[0]) {
                case "add":
                    firstContainer = Math.min(MAX, firstContainer + value);
                    break;
                case "move":
                    secondContainer = Math.min(MAX, secondContainer + Math.min(firstContainer, value));
                    firstContainer = Math.max(0, firstContainer - value);
                    break;
                case "remove":
                    secondContainer = Math.max(0, secondContainer - value);
            }
            
        }
    }

}
