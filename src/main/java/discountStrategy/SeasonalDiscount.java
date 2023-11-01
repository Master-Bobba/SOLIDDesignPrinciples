package discountStrategy;

public class SeasonalDiscount implements Discount{

    @Override
    public double calculateDiscount(double amount) {
        return amount*0.1;
    }
}
