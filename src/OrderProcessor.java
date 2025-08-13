public class OrderProcessor {
    private ShoppingCart shoppingCart;

    public OrderProcessor(ShoppingCart cart) {
        this.shoppingCart = cart;
    }

    public void processOrder() {
        if (shoppingCart.getProducts().size() == 0) {
            System.out.println("Корзина пуста, оформить заказ невозможно.");
            return;
        }
        System.out.println("Оформление заказа...");
        System.out.println("Сумма к оплате: ₽" + shoppingCart.calculateTotalCost());
        shoppingCart.clear();
        System.out.println("Заказ оформлен успешно!");
    }
}
