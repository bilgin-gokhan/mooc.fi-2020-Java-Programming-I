
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int priceThis = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;
        return Math.abs(priceThis - priceCompared);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return (this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares);
    }

}
