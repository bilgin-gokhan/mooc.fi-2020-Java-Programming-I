
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals = 0; // number of sold affordable meals
    private int heartyMeals = 0;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTILY_PRICE = 4.3;

    public PaymentTerminal() {
        money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= AFFORDABLE_PRICE) {
            affordableMeals++;
            money = money + AFFORDABLE_PRICE;
            return payment - AFFORDABLE_PRICE;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTILY_PRICE) {
            heartyMeals++;
            money = money + HEARTILY_PRICE;
            return payment - HEARTILY_PRICE;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= AFFORDABLE_PRICE) {
            affordableMeals++;
            card.takeMoney(AFFORDABLE_PRICE);
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= HEARTILY_PRICE) {
            heartyMeals++;
            card.takeMoney(HEARTILY_PRICE);
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) {
            card.addMoney(sum);
            money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
