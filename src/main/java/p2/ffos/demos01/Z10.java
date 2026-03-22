package p2.ffos.demos01;

import javax.swing.*;

public class Z10 {
    public static void main(String[] args) {
        int[][] ocjene = new int[3][3];
        double najboljiProsjek = -1;
        int najboljiStudent = 0;
        String sviPodaci = "Sve ocjene:\n";

        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                ocjene[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Student" + " " + (i+1) + ", kolegij" + " " + (j+1) + ":"));
                suma += ocjene[i][j];
            }
            double prosjek = suma / 3.0;
            if (prosjek > najboljiProsjek) {
                najboljiProsjek = prosjek;
                najboljiStudent = i + 1;
            }
        }

        for (int[] red : ocjene) {
            for (int ocjena : red) {
                sviPodaci += ocjena + " ";
            }
            sviPodaci += "\n";
        }

        System.out.println(sviPodaci + "Najbolji student je:" + " " + najboljiStudent);
    }
}
