public class ProductPage {
    private Product product;

    public ProductPage(Product product) {
        System.out.println("opening product page...");
        this.product = product;
    }

    public void addToCart(ShoppingCart shoppingCart){
        shoppingCart.add(this.product);
    }

    public ShoppingCart openShoppingCart(Customer customer){
        System.out.println("opening shopping cart");
        return customer.getShoppingCart();
    }
}
