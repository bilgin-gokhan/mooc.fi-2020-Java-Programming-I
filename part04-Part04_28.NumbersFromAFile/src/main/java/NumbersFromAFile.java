
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumbersFromAFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("File? ");
            String file = scanner.nextLine();
            System.out.print("Lower bound? ");
            int lowerBound = Integer.valueOf(scanner.nextLine());
            System.out.print("Upper bound? ");
            int upperBound = Integer.valueOf(scanner.nextLine());
            
            ArrayList<Integer> list = new ArrayList<>();
            
            Scanner sc = new Scanner(Paths.get(file));
            
            while (sc.hasNextLine()) {                
                list.add(Integer.valueOf(sc.nextLine()));
            }
            
            int count = 0;
            for (Integer integer : list) {
                if (integer >= lowerBound && integer <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (IOException ex) {
            Logger.getLogger(NumbersFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
