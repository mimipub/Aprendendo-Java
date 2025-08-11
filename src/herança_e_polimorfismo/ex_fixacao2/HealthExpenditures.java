package herança_e_polimorfismo.ex_fixacao2;

public class HealthExpenditures extends TaxPayers {
    private double healthExpenditures;

    public HealthExpenditures() {}

    public HealthExpenditures(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double taxPayers() {
        if(getAnualIncome() >= 20000.0){
            return getAnualIncome() * 0.25 - (healthExpenditures * 0.5);
        }else{
            return getAnualIncome() * 0.15;
        }
    }
}
