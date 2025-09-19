package interfaces.herancamult;

public class Printe extends Device{
    public Printe(String serialNumber) {
        super(serialNumber);
    }

    public void Printe(String doc) {
        System.out.println("Printing " + doc );
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing " + doc);
    }
}
