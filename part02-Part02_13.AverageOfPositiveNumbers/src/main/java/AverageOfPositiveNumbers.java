
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        int sum = 0;
        
        while (true) {    
           
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }
            
            if (num > 0) {
                numbers = numbers + 1;
                sum = sum + num;
            }
            
            if (num == 0) {
                break;
            }
            
        }
        double avg = (double) sum / numbers;
        System.out.println("Average of the numbers: " + avg);
    }
}
