public class Customer {
    int id;
    private String username;
    private String password;
    private String name;
    private ShoppingCart shoppingCart;

    public Customer(int id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.shoppingCart = null;
    }

    public void createShoppingCart(){
        this.shoppingCart = new ShoppingCart();
    }

    public ProductPage openProductPage(Product product){
        return new ProductPage(product);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
