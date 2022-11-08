public class Product {
    private int productId;
    private String productName;
    private String productDescr;
    private double price;
    private int quantity;

    public Product(int productId, String productName, String productDescr, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productDescr = productDescr;
        this.price = price;
        this.quantity = quantity;
    }
}
