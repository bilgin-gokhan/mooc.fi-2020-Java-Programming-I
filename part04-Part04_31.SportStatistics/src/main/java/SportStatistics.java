
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("File:");
            String path = scan.nextLine();
            
            System.out.println("Team:");
            String team = scan.nextLine();
            
            Scanner sc = new Scanner(Paths.get(path));
            ArrayList<String[]> list = new ArrayList<>();
            
            while (sc.hasNextLine()) {                
                String line = sc.nextLine();
                String[] parts = line.split(",");
                list.add(parts);
            }
            
            int losses = 0;
            int wins = 0;
            for (String[] parts : list) {
                int score1 = Integer.valueOf(parts[2]);
                int score2 = Integer.valueOf(parts[3]);
                
                if (parts[0].equalsIgnoreCase(team) && score1 > score2 || parts[1].equalsIgnoreCase(team) && score2 > score1) {
                    wins++;
                } else if (parts[0].equalsIgnoreCase(team) || parts[1].equalsIgnoreCase(team)) {
                    losses++;
                }
            }
            
            int games = wins + losses;
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(SportStatistics.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
