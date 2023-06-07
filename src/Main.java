public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);
        PriceObserver priceMonitor = new PriceObserver();
        QuantityObserver quantityMonitor = new QuantityObserver();

        order.attach(priceMonitor);
        order.attach(quantityMonitor);

        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);
        order.addItem(100);

        order.FinalPrice();
        System.out.println(order);
    }


}