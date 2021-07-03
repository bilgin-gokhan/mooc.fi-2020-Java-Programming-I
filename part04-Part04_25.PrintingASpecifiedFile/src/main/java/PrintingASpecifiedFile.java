
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which file should have its contents printed?");
            String path = scanner.nextLine();
            Scanner sc = new Scanner(Paths.get(path));
            while (sc.hasNextLine()) {                
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(PrintingASpecifiedFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}
