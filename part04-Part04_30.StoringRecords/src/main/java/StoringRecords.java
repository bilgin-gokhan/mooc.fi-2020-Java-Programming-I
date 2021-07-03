
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()) {                
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                persons.add(new Person(name, age));
            }
            
            // Write here the code for reading from file
            // and printing the read records
            
        } catch (IOException ex) {
            Logger.getLogger(StoringRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
}
