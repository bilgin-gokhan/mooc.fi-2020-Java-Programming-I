
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {

    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        String output = "";
        if (this.jokes.isEmpty()) {
            output = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            output = this.jokes.get(index);
        }
        return output;
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
