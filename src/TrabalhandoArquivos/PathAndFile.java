package TrabalhandoArquivos;

import java.io.File;
import java.util.Scanner;

public class PathAndFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path:");
        String path = sc.nextLine();

        File file = new File(path);

        System.out.println("Arquivos:");
        File[] folders = file.listFiles(File::isDirectory);
        for(File folder : folders){
            System.out.println(folder);
        }

        System.out.println("Textos");
        File[] files = file.listFiles(File::isFile);
        for(File fil: files){
            System.out.println(fil);
        }

        Boolean sucess = new File(file + "\\Pastacriada").mkdir();
        System.out.println("Diretório criado com sucesso: " + sucess);
        sc.close();
    }
}
