package circunference;

public class Circunferencia {
    public double radius;
    public static final double PI = 3.14159265358979;

    public static double volum(double radius) {
        return (4/radius) * PI * Math.pow(radius, 3);
    };

    public static double circunference(double radius){
        return 2 * PI * radius;

    };


    public double Circle() {
        double C = 2 * PI * radius;
        return C;
    }

    public double volume() {
        double v = (4/radius) * PI * Math.pow(radius, 3);
        return v;
    }

    public String toString(){
        return "Circunferencia: "
                + radius
                + String.format("\nCircle: %.2f ", Circle())
                + String.format("\nVolume: %.2f ", volume())
                + String.format("\nPI: %.2f ", PI);
    }
}
