package interfaces.herancamult;

public class App {
    public static void main(String[] args) {

        System.out.println();
        Printe p = new Printe("1080");
        p.processDoc("my Letter");
        p.Printe("my letter");

        System.out.println();
        Scaner sc = new Scaner("8080");
        sc.processDoc("my Letter");
        System.out.println("Scan Result " + sc.scan());

        System.out.println();
        ComboDevice cd = new ComboDevice("2003");
        cd.processDoc("My dissertation");
        cd.print("My dissertation");
        System.out.println("Combo printing " + cd.scan());
    }
}