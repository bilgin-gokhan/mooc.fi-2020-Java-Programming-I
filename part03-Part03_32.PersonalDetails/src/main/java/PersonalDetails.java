
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0;
        int count = 0;
        while (true) {    
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] in = input.split(",");
            if (in[0].length() > name.length()) {
                name = in[0];
            }
            sum = sum + Integer.valueOf(in[1]);
            count = count + 1;
            
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));


    }
}
