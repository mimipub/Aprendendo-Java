package herança_e_polimorfismo.exercicioprop.model;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        double pay = super.payment();
        pay += additionalCharge * 1.1; // 10% additional charge
        return pay;
    }
}
