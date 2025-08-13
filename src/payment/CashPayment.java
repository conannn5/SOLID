package payment;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата наличными: ₽" + amount);
    }
}
