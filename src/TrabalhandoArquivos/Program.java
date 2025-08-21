package TrabalhandoArquivos;

import javax.xml.xpath.XPath;
import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path:");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Nome do arquivo: " + path.getName());
        System.out.println("Nome do caminho: " + path.getParent());
        System.out.println("Nome do Path: " + path.getPath());
        sc.close();
    }
}
