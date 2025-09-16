package interfaces.exerciciofixação.services;

public class PaypalService implements OnlinePaymentService{

    public static final double juroSimples = 0.01;
    public static final double taxa = 0.02;

    @Override
    public double interest(Double amount, Integer months){
        return amount * juroSimples * months ;
    }

    @Override
    public double paymentFee(Double amount) {
        return amount * taxa;
    }
}