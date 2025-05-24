package arrayunidimensional.exercicio3;

public class ProducAlt {
    public void mediaAltura(double[] altura, int p) {
        double media = 0;
        for (int i = 0; i < p; i++) {
            media += altura[i];
        }
        media /= p;
        System.out.printf("Altura média %.2f: %n ", media);
    }

    public void porcentagemMenorIdade(int[] idades, String[] nomes) {





        for (int j = 0; j < idades.length; j++) {
            if (idades[j] < 16) {
                System.out.println(nomes[j]);
            }
        }
    }
}
