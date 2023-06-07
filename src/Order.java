import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    double totalPrice;
    private int itemCount;
    private List<OrderObserver> observers;

    private int discount;

    private int shippingCost;

    public Order(int id) {
        this.id = id;
        this.totalPrice = 0.0;
        this.itemCount = 0;
        this.observers = new ArrayList<>();
        this.shippingCost=10;
        this.discount=0;
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void addItem(double price) {
        totalPrice += price;
        itemCount++;
        for (OrderObserver observer : observers) {
            observer.update(this);
        }

    }

    public void FinalPrice(){
        totalPrice=totalPrice+shippingCost-discount;
    }

    @Override
    public String toString() {
        return "Order #" + id + " | Total Price: $" + totalPrice + " | Item Count: " + itemCount;
    }
}
