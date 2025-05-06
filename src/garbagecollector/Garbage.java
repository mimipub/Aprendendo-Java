package garbagecollector;

public class Garbage {
    public static void main(String[] args) {
        Collector p1, p2;
        p1 = new Collector("objeto1", "objeto2", 10);
        p2 = new Collector("objeto3", "objeto4", 20);

        p2 = p1; // quando faço essa chamada, o objeto p2 vira p1, o objeto p2 deixa de existir na memória.

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //deslaocamento por escopo
         p1.metodo1();

    }
}
