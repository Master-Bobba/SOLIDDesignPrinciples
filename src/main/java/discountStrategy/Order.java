package discountStrategy;

public class Order {
    private double totalAmount;

    private Discount discount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double applyDiscount(){
        return this.totalAmount - discount.calculateDiscount(this.totalAmount);
    }

    public double applyFlatDiscount() {
        // Assume the flat discount is 20% of the total amount
        return this.totalAmount - (this.totalAmount * 0.2);
    }

    public double applySeasonalDiscount() {
        // Assume the seasonal discount is 10% of the total amount
        return this.totalAmount - (this.totalAmount * 0.1);
    }

    // Other methods...
}
