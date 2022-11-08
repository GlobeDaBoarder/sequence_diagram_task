public class Main {
    public static void main(String[] args) {
        //our user that exists from the beginning of the program
        Customer customer = new Customer(0, "ALex1234", "12345", "Alex");

        //product objects of the shop, that exist from the beginning of the program
        Product book = new Product(0, "Book", "funny book", 10, 5);
        Product bike = new Product(0, "Bike", "ride", 100, 3);
        Product phone = new Product(0, "Phone", "funny book", 1000, 13);

        //creating shopping cart of customer
        customer.createShoppingCart();
        //opening product page of product book
        ProductPage productPage = customer.openProductPage(book);
        //adding book product to shopping cart of user
        productPage.addToCart(customer.getShoppingCart());

        ShoppingCart shoppingCart = productPage.openShoppingCart(customer);
        PaymentPage paymentPage = shoppingCart.openPaymentPage();
        paymentPage.pay("0000 0000 0000 0000", "123");

    }
}
