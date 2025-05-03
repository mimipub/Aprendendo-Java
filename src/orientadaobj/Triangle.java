package orientadaobj;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public String name;

    public double area(double a, double b, double c) {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public String toString() {
        return name;
    }
}
