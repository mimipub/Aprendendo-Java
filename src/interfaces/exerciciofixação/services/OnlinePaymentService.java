package interfaces.exerciciofixação.services;

public interface OnlinePaymentService {
    double paymentFee (Double amount);
    double interest(Double amount, Integer Months);
}