public class OrderTest {
    public static void main(String[] args) {
        OrderAction orderAction = new OrderActionImpl();
        OrderProcessing orderProcessing = new OrderProcessingImpl();

        orderProcessing.calculateTotal(10.0, 2);
        orderAction.placeOrder("John Doe", "123 Main St");
    }
}