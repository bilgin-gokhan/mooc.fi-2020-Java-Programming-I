
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sum = 0;
        
        while (true) {    
           
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                break;
            }
            
            if (num != 0) {
                numbers = numbers + 1;
                sum = sum + num;
            }
            
        }
        double avg = (double) sum / numbers;
        System.out.println("Average of the numbers: " + avg);
    
    }
}
