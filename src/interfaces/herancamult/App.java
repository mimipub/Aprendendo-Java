package interfaces.herancamult;

public class App {
    public static void main(String[] args) {
        Printer p = new Printer("1080");
        p.processDoc("my Letter");
        p.Printer("my letter");

        Scanner sc = new Scanner("8080");
        sc.processDoc("my Letter");
        System.out.println("Scan Result " + sc.scan());
    }
}
