package exam.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
