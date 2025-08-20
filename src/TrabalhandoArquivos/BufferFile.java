package TrabalhandoArquivos;

import java.io.*;

public class BufferFile {
    public static void main(String[] args) {

        String[] lines = new String[] {"testando", "cada", "linha de código"};

        String path = "C:\\temp\\tst.txt";

        try(BufferedWriter br = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines) {
                br.write(line);
                br.newLine();
            }
            br.newLine();
            System.out.println("Arquivo criado com sucesso!");
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
