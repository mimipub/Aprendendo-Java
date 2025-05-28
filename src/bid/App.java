package bid;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 8) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("left " + mat[i][j - 1]);
                    }

                    if (j < m - 1) {
                        System.out.println("right " + mat[i + 1][j]);
                    }

                    if (i > 0) {
                        System.out.println("Up " + mat[i - 1][j]);
                    }
                    if (j < n + 1 ){
                        System.out.println("down " + mat[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
