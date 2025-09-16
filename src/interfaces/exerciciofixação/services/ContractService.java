package interfaces.exerciciofixação.services;

import datahora.Date;
import interfaces.exerciciofixação.model.Contract;
import interfaces.exerciciofixação.model.Installment;

import java.time.LocalDate;
import java.time.Month;

public class ContractService{
    private OnlinePaymentService onlinePaymentService;

    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer month) {
        double quota = contract.getTotalValue()/month;
        for (int i = 1; i <= month ; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interested = onlinePaymentService.interest(quota, i);
            double fee = onlinePaymentService.paymentFee(quota + interested);
            double total = interested + fee + quota ;
            contract.getInstallments().add(new Installment(dueDate, total));
        }
    }
}
