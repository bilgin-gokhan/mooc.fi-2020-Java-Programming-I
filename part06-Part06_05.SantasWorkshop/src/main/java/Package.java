
import java.util.ArrayList;

public class Package {

    private final ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int weightSum = 0;
        for (Gift gift : gifts) {
            weightSum = weightSum + gift.getWeight();
        }
        return weightSum;
    }

}
