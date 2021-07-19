
import java.util.ArrayList;

public class Suitcase {

    private final int maxWeight;
    private final ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item itm : items) {
            totalWeight = totalWeight + itm.getWeight();
        }
        if (item.getWeight() + totalWeight <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight = totalWeight + item.getWeight();
        }
        if (items.size() < 1) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return "1 item (" + totalWeight + " kg)";
        } else {
            return items.size() + " items (" + totalWeight + " kg)";
        }
    }

    public void printItems() {
        String output = "";
        for (Item item : items) {
            output = output + item.getName() + " (" + item.getWeight() + " kg)";
            if (items.size() > 1) {
                output = output + "\n";
            }
        }
        System.out.println(output);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = new Item("", 0);
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
