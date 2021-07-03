import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            String pages = scanner.nextLine();
            System.out.println("Publication year:");
            String year = scanner.nextLine();
            
            books.add(new Books(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Books book : books) {
                System.out.println(book);
            }
        } else if (input.equals(input)) {
            for (Books book : books) {
                System.out.println(book.getName());
            }
        }

    }
}
