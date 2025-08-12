

public class Main {
    public static void main(String[] args) {
        Product wine = new Product("ВИНО", "Вино", 371.50);
        Product apple = new Product("ЯБЛОКИ", "Яблоки", 128.70);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(wine);
        cart.addProduct(apple);

        OrderProcessor processor = new OrderProcessor(cart);
        processor.processOrder();
    }
}
