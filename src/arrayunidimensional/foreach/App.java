package arrayunidimensional.foreach;

public class App {
    public static void main(String[] args) {
        String[] vect = new String[] { "Mizael", "Miguel", "João" };

        for (int i = 0; i <vect.length ; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect) {  // for each (tipo primitivo ou objeto, depois o "apelido" : vetor ou lista)
            System.out.println(obj);
        }
    }
}
