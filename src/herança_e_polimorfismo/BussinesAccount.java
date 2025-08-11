package herança_e_polimorfismo;

public class BussinesAccount extends Account {
    private double loanLimit;

    public BussinesAccount() {
        super();
    }

    public BussinesAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public BussinesAccount(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (loanLimit <= amount){
            balance += amount - 10.0;
        }
    }
}
