// PriceObserver class
class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        if (order.getTotalPrice() > 200){
            order.setDiscount(20);
        }
    }
}


