package employ;

public class Employee {
    public String name;
    public double grosSalary;
    public double tax;

    public double netSalary (){
        return grosSalary - tax;
    }

    public void increasySalary(double percentage) {
        double increasy = grosSalary * percentage/100;
        grosSalary += increasy;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
