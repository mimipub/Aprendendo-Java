package garbagecollector;

public class Collector {
    public String objeto;
    public String objeto2;
    public int numero;


    public Collector(String objeto, String objeto2, int numero) {
        this.objeto = objeto;
        this.objeto2 = objeto2;
        this.numero = numero;
    }

    void metodo1(){
        int x = 10;
        if(x < 10){
            int y = 20;
            System.out.println(y);
        }
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Collector{" +
                "objeto='" + objeto + '\'' +
                ", objeto2='" + objeto2 + '\'' +
                ", numero=" + numero +
                '}';
    }
}
