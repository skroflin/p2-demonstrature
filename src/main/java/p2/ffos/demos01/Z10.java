package p2.ffos.demos01;

import javax.swing.*;

public class Z10 {
    public static void main(String[] args) {
        //dvodimenzionalni niz
        int[][] ocjene = new int[3][3];
        double najboljiProsjek = -1; //svaka ocjena je veća od navedenog prosjeka
        int najboljiStudent = 0;
        String sviPodaci = "Sve ocjene:\n";

        //1. pretlja - predstavlja studente/učenike
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                //2. petlja - predstavlja kolegije/predmete
                ocjene[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Student" + " " + (i+1) + ", kolegij" + " " + (j+1) + ":"));
                suma += ocjene[i][j];
            }

            //ukoliko se pri proračunu novi student ima veći prosjek od trenutnog - novi zauzima mjesto
            double prosjek = suma / 3.0;
            if (prosjek > najboljiProsjek) {
                najboljiProsjek = prosjek;
                najboljiStudent = i + 1;
            }
        }

        //1. petlja uzima sve ocjene jednog studenta
        for (int[] red : ocjene) {
            for (int ocjena : red) {
                //2. petlja uzima svaku ocjenu posebno
                sviPodaci += ocjena + " ";
            }
            sviPodaci += "\n";
        }

        System.out.println(sviPodaci + "Najbolji student je:" + " " + najboljiStudent);
    }
}
