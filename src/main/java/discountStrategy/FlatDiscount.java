package discountStrategy;

public class FlatDiscount implements Discount{
    @Override
    public double calculateDiscount(double amount) {
        return amount*0.2;
    }
}
