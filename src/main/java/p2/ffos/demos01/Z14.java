package p2.ffos.demos01;

import javax.swing.*;

public class Z14 {
    public static void main(String[] args) {
        int redovi = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
        int stupci = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));

        int[][] tablica = new int[redovi][stupci];

        int vrijednost = 1;
        int minRed = 0;
        int maksRed = redovi - 1;
        int minStup = 0;
        int maksStup = stupci - 1;

        int red = maksRed;
        int stupac = maksStup;

        int smjer = 0;

        while (vrijednost <= redovi * stupci) {
            tablica[red][stupac] = vrijednost++;
            if (smjer == 0) {
                if (stupac - 1 < minStup) {
                    smjer = 1;
                    maksRed--;
                    red--;
                } else {
                    stupac--;
                }
            } else if (smjer == 1) {
                if (red - 1 < minRed) {
                    smjer = 2;
                    minStup++;
                    stupac++;
                } else {
                    red--;
                }
            } else if (smjer == 2) {
                if (stupac + 1 > maksStup) {
                    smjer = 3;
                    minRed++;
                    red++;
                } else {
                    stupac++;
                }
            } else {
                if (red +1 > maksRed) {
                    smjer = 0;
                    maksStup--;
                    stupac--;
                } else {
                    red++;
                }
            }
        }

        System.out.println("Ciklična tablica (" + redovi + "x" + stupci + "): \n");

        int maksBroj = redovi * stupci;
        int brojke = String.valueOf(maksBroj).length();
        String format = "%" + (brojke + 1) + "d";

        for (int i = 0; i < redovi; i++) {
            for (int j = 0; j < stupci; j++) {
                System.out.printf(format, tablica[i][j]);
            }
            System.out.println();
        }
    }
}
