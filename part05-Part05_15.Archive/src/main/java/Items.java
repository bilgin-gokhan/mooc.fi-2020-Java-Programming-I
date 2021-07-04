
public class Items {

    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public Items() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object compared) {
        Items item = (Items) compared;
        return this.identifier.equals(item.identifier);
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
