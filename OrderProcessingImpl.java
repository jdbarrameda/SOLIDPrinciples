public class OrderProcessingImpl implements OrderProcessing {
    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }
}