package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(0 ,"test"); // Adiciona o elemento "test" na posição 0

        System.out.println(list.size());
        list.add(2 ,"test");
        //list.remove(2); // Remove o elemento por posicção.
        //list.remove("Alex"); // Remove o elemento por elemento.

        for (String X : list) {
            System.out.println(X);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("removendo os elementos com a letra M");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String X : list) {
            System.out.println(X);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("index of bob " + list.indexOf("Bob")); // Retorna a posição do elemento
        System.out.println("index of test " + list.indexOf("Mizael")); // Retorna -1 pois o elemento não existe

        System.out.println("-------------------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String X : result) {
            System.out.println(X);
        }
        System.out.println("-------------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'x').findFirst().orElse(null);

        System.out.println(name);
    }
}
