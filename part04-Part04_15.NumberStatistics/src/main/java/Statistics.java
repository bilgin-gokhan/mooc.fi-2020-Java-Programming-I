
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variables count and sum here
        count = 0;
        sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum += number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        if (this.count != 0) {
            return 1.0 * this.sum / this.count;
        } else {
            return 0;
        }
        
    }
}
