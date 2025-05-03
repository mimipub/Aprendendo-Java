package medianota;

import java.sql.SQLOutput;

public class Media {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public void calcularMedia() {
        double media = n1 + n2 + n3;
        if(media > 60 ){
            System.out.printf("TOTAL PASS = %.2f \n",media);
            System.out.println("PASS");
        }else{
            double resto = 60-media;
            System.out.printf("MISSING %.2f POINTS", resto);
        }
    }

}
