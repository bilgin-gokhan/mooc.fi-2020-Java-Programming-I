
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int existAmountAtFirst = 0;
        int existAmountAtSecond = 0;

        while (true) {
            System.out.println("First: " + existAmountAtFirst + "/100");
            System.out.println("Second: " + existAmountAtSecond + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 1) {
                continue;
            }

            if (command.equals("add")) {
                if (existAmountAtFirst + amount >= 100) {
                    existAmountAtFirst = 100;
                } else {
                    existAmountAtFirst = existAmountAtFirst + amount;
                }
            }
            if (command.equals("move")) {
                if (amount > existAmountAtFirst) {
                    existAmountAtSecond = existAmountAtSecond + existAmountAtFirst;
                    existAmountAtFirst = 0;
                } else {
                    existAmountAtFirst = existAmountAtFirst - amount;
                    existAmountAtSecond = existAmountAtSecond + amount;
                }
            }
            
            if (command.equals("remove")) {
                if (existAmountAtSecond - amount >= 0) {
                    existAmountAtSecond = existAmountAtSecond - amount;
                } else {
                    existAmountAtSecond = 0;
                }
            }
            
            if (existAmountAtSecond > 100) {
                existAmountAtSecond = 100;
            }

        }
    }

}
