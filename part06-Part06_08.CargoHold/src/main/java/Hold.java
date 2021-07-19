
import java.util.ArrayList;

public class Hold {

    private final ArrayList<Suitcase> suitcases = new ArrayList<>();
    private final int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase suitc : suitcases) {
            totalWeight = totalWeight + suitc.totalWeight();
        }
        if (suitcase.totalWeight() + totalWeight <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
