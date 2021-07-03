
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecordsFromAFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Name of the file:");
            String path = scanner.nextLine();
            
            Scanner sc = new Scanner(Paths.get(path));
            
            while (sc.hasNextLine()) {                
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String yearformat = "years";
                
                if (Integer.valueOf(parts[1]) == 1) {
                    yearformat = "year";
                }
                System.out.println(parts[0] + ", age: " + parts[1] + " " + yearformat);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(RecordsFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
