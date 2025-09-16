package interfaces.exerciciofixação.view;

import interfaces.exerciciofixação.model.Contract;
import interfaces.exerciciofixação.model.Installment;
import interfaces.exerciciofixação.services.ContractService;
import interfaces.exerciciofixação.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados do contrato: ");
        System.out.print("numero:");
        int contract = sc.nextInt();
        System.out.print("data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), sdf);
        System.out.println("Valor do contrato: ");
        double valueContract = sc.nextDouble();

        Contract contract1 = new Contract(contract, date, valueContract);

        System.out.print("Digite o numero de parcelas do contrato:");
        int parcelas = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract1, parcelas);

        System.out.println("Parcelas: ");

        for(Installment installment : contract1.getInstallments()){
            System.out.println(installment);
        }
        sc.close();
    }
}
