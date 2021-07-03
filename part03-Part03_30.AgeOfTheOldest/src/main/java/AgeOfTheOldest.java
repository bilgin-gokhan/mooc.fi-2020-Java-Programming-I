
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int big = 0;
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("")) {
                break;
            }
            
            String[] word = words.split(",");
            if (Integer.valueOf(word[1]) >= big) {
                big = Integer.valueOf(word[1]);
            }
        }
        System.out.println("Age of the oldest: " + big);

    }
}
