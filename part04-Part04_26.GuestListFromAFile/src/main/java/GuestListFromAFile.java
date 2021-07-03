
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuestListFromAFile {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Name of the file:");
            String file = scanner.nextLine();
            
            ArrayList<String> list = new ArrayList<>();
            // implement reading the file here.
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()) {                
                list.add(sc.nextLine());
            }
            System.out.println("");
            
            System.out.println("Enter names, an empty line quits.");
            while (true) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                
                if (list.contains(name)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list.");
                }
            }
            
            System.out.println("Thank you!");
        } catch (IOException ex) {
            Logger.getLogger(GuestListFromAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
