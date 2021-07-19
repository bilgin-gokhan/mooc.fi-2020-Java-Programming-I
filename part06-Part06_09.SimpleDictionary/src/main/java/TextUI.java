
import java.util.Scanner;

public class TextUI {

    private final Scanner scanner;
    private final SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();
            String translation;

            if (!word.equals("end") && !word.equals("add") && !word.equals("search")) {
                System.out.println("Unknown command");
            } else if (word.equals("add")) {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                word = scanner.nextLine();
                if (simpleDictionary.translate(word) == null) {
                    System.out.println("Word " + word + " was not found.");
                } else {
                    System.out.println("Translation: " + simpleDictionary.translate(word));
                }
            } else {
                System.out.println("Bye bye!");
                break;
            }
        }

    }
}
