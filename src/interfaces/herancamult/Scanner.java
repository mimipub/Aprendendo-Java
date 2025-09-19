package interfaces.herancamult;

public class Scanner extends Device{
    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    public String scan(){
        return "Scaned content ";
    }

    @Override
    public void processDoc(String doc){
        System.out.println("testando " + doc);
    }
}
