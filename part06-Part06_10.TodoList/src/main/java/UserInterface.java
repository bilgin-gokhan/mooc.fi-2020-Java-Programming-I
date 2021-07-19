
import java.util.Scanner;

public class UserInterface {

    private final TodoList todoList;
    private final Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            if (word.equals("stop")) {
                break;
            } else if (word.equals("add")) {
                while (true) {
                    System.out.print("To add: ");
                    word = scanner.nextLine();
                    if (word.equals("stop")) {
                        break;
                    } else {
                        todoList.add(word);
                        break;
                    }
                }
            } else if (word.equals("list")) {
                todoList.print();
            } else if (word.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = scanner.nextInt();
                todoList.remove(number);
            }
        }
    }
}
