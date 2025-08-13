package payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой: ₽" + amount);
    }
}
