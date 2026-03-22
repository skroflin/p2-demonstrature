package p2.ffos.demos01;

public class Z08 {
    public static void main(String[] args) {
        int[][] matrica = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        String ispis = "";

        for (int i = 0; i < 3; i++) {
            int zbrojRetka = 0;
            for (int j = 0; j < 3; j++) {
                zbrojRetka += matrica[i][j];
            }
            ispis += "Zbroj" + " " + (i + 1) + ". " + "retka:" + " " + zbrojRetka + "\n";
        }
        System.out.println(ispis);
    }
}
