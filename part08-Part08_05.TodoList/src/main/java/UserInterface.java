
import java.util.Scanner;

public class UserInterface {
    
    private Scanner sc;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner sc) {
        this.sc = sc;
        this.todoList = todoList;
    }
    
    public void start() {
        String input;
        
        while (true) {
            System.out.print("Command: ");
            input = sc.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.print("To add: ");
                todoList.add(sc.nextLine());
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                todoList.remove(Integer.parseInt(sc.nextLine()));
            } else if (input.equals("list")) {
                todoList.print();
            }
        }
    }
}
