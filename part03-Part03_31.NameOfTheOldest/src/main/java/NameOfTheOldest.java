
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = 0;
        String name = "";
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            
            String[] word = words.split(",");
            if (Integer.valueOf(word[1]) >= big) {
                big = Integer.valueOf(word[1]);
                name = word[0];
            }
        }
        System.out.println("Name of the oldest: " + name);


    }
}
