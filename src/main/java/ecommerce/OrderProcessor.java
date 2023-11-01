package ecommerce;

import discountStrategy.Order;

public class OrderProcessor {
    private PaymentProcessor paymentProcessor;
    private OrderNotifier notifier;

    public OrderProcessor(PaymentProcessor paymentProcessor, OrderNotifier notifier) {
        this.paymentProcessor = paymentProcessor;
        this.notifier = notifier;
    }

    public void setOrderNotifier(OrderNotifier orderNotifier){
        this.notifier = orderNotifier;
    }

    public void setPaymentProcessor(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void processOrder(Order order) {
        paymentProcessor.processPayment(order.getTotalAmount());
        notifier.notifyUserOrderConfirmed();
    }
    
    /**
     * Just for testing purposes
     * @param args
     */
    public static void main(String[] args){
        OrderProcessor orderProcessor = new OrderProcessor(new BitcoinPaymentProcessor(), new UserOrderNotifier());
        orderProcessor.processOrder(new Order(5.00));

    }
}
