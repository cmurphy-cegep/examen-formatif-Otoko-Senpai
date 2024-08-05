
public class OrderFacade {
    Stock stock = new Stock();
    Shipping shipping = new Shipping();
    Payment payement = new Payment();

    public OrderFacade() {
        
    }

    public void placeOrder(String item, int quantity, String paymentDetails, String address) {
        if(stock.checkStock(item, quantity)){
            payement.processPayment(paymentDetails);
            shipping.arrangeShipping(item,quantity,address);
        }
        else{
            stock.updateStock(item,quantity);
        }
        


    }
}
