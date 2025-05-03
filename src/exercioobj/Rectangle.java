package exercioobj;

public class Rectangle {
    public double width;
    public double height;

    public double area(double width, double height) {
        return height * width;
    }

    public double perimeter(double width, double height) {
        return 2 * (height+width);
    }

    public double diagonal() {
        return Math.sqrt((width*width)+(height*height));
    }

    public String toString() {
        return String.format("AREA = %.2f" , area(height, width))
                + String.format("\nPERIMETER = %.2f" , perimeter(height, width))
                + String.format("\nDIAGONAL = %.2f" , diagonal());
    }
}

