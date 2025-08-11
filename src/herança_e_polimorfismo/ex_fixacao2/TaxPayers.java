package herança_e_polimorfismo.ex_fixacao2;

public abstract class TaxPayers {
    private String Name;
    private double AnualIncome;

    public TaxPayers() {
    }

    public TaxPayers(String name, double anualIncome) {
        Name = name;
        AnualIncome = anualIncome;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getAnualIncome() {
        return AnualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        AnualIncome = anualIncome;
    }

    public abstract double taxPayers();
}
