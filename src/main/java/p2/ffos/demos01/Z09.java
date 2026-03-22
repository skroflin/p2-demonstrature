package p2.ffos.demos01;

public class Z09 {
    public static void main(String[] args) {
        //dvodimenzionalni niz
        int[][] m = { {1, 2, 3}, {4, 5, 6} };
        int[][] t = new int[3][2];
        String prikaz = "Transponirana matrica:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                //služi za mijenjanje koordinata
                //npr. ono što je bilo na poziciji (red 1, stupac 2) seli se na (red 2, stupac 1)
                t[j][i] = m[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                prikaz += t[i][j] + " ";
            }
            prikaz += "\n";
        }

        System.out.println(prikaz);
    }
}
