package TrabalhandoArquivos;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraAquiv {
    public static void main(String[] args) {
        File ficheiro = new File("c:\\temp\\seila.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(ficheiro);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}