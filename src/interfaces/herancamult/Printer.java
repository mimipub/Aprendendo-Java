package interfaces.herancamult;

public class Printer extends Device{
    public Printer(String serialNumber) {
        super(serialNumber);
    }

    public void Printer(String doc){
        System.out.println("processing " + doc);
    }

    @Override
    public void processDoc(String doc){
        System.out.println("Printer processing " + doc);
    }

}
