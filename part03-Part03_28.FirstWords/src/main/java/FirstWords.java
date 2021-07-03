
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            
            String[] word = words.split(" ");
            System.out.println(word[0]);
            
        }


    }
}
