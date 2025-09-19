package interfaces.herancamult;

public class Scaner extends Device{
    public Scaner(String serialNumber) {
        super(serialNumber);
    }

    public String scan(){
        return "Scanned content";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing " + doc);
    }
}
