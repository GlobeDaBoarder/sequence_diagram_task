import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        System.out.println("Cart is created!");
        this.products = new ArrayList<>();
    }

    public void add(Product product){
        System.out.println("added " + product + " to shopping cart");
        this.products.add(product);
    }

    public PaymentPage openPaymentPage(){
        return new PaymentPage();
    }
}
