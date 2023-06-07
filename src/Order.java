import java.util.ArrayList;
import java.util.List;

public class Order {

    double totalPrice;
    private int itemCount;
    private List<OrderObserver> observers;

    private int discount;

    private int shippingCost;


    public Order(int id) {
        this.totalPrice = 0.0;
        this.itemCount = 0;
        this.observers = new ArrayList<>();
        this.shippingCost=10;
        this.discount=0;
    }

    public void attach(OrderObserver observer) {

    }

    public void detach(OrderObserver observer) {

    }


    public double getTotalPrice(){
        return totalPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setShippingCost(int shippingCost) {

    }

    public void setDiscount(int discount) {

    }

    @Override
    public String toString() {
       return null;
    }

}
