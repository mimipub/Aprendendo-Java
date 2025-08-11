package lista.exercicio;

public class Employ {
    private Integer id;
    private String name;
    private double salary;


    public Employ(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increasySalary(double percentage) {
        this.salary += (salary * percentage / 100);
    }

    @Override
    public String toString() {
        return
                this.id + "," + name + ", Salary: " + String.format("%.2f", salary);
    }
}
