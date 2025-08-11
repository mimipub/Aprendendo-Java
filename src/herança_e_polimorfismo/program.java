package herança_e_polimorfismo;

public class program {
    public static void main(String[] args) {
        Account acc = new Account(3000, "Maria", 500.0);
        BussinesAccount acc1 = new BussinesAccount(3001, "João", 500.0, 0.03);
        SavingsAccount acc2 = new SavingsAccount(3002, "marcelo", 200.0, 0.05);

        Account cvt1 = acc1; // Upcasting
        Account cvt2 = acc2; // Upcasting
        Account cvt3 = new BussinesAccount(3003, "Lucas", 1000.0, 0.02); // Upcasting
        Account cvt4 = new SavingsAccount(3004, "Ana", 1500.0, 0.04); // Upcasting

        // Downcasting
        // BussinesAccount conv = (BussinesAccount) acc;

        if(acc instanceof BussinesAccount){
            BussinesAccount conv = (BussinesAccount) acc;
            conv.loan(100.0);
            System.out.println("teste");
        }
        //SavingsAccount conv2 = (SavingsAccount) acc1;

        if(acc2 instanceof SavingsAccount){
            SavingsAccount convr = (SavingsAccount) acc2;
            acc.deposit(100.0);
            System.out.println("Deposito realizado com sucesso!");
        }


    }

}
