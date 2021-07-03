
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IsItInTheFile {

    public static void main(String[] args) {
        String file = "";
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Name of the file:");
            file = scanner.nextLine();
            
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            
            List<String> list = new ArrayList<>();
            
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()) {                
                String row = sc.nextLine();
                list.add(row);
            }
                if (list.contains(searchedFor)) {
                    System.out.println("Found!");
                } else {
                    System.out.println("Not found.");
                }
            
            
        } catch (IOException ex) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
