package p2.ffos.demos01;

import javax.swing.*;

public class Z01 {
    public static void main(String[] args) {
        double cijena = Double.parseDouble(JOptionPane.showInputDialog("Unesite cijenu proizvoda:"));

        String kolicinaCijene = JOptionPane.showInputDialog("Unesite količinu proizvoda:");
        int kolicina = Integer.parseInt(kolicinaCijene);

        double ukupno = cijena * kolicina;
        if (kolicina > 10) {
            ukupno *= 0.8;
        }
        System.out.println("Konačna cijena s popustom" + " " + ukupno);
    }
}
