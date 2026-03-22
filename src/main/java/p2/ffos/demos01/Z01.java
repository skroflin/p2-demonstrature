package p2.ffos.demos01;

import javax.swing.*;

public class Z01 {
    public static void main(String[] args) {
        double cijena = Double.parseDouble(JOptionPane.showInputDialog("Unesite cijenu proizvoda:"));

        String kolicinaCijene = JOptionPane.showInputDialog("Unesite količinu proizvoda:");
        int kolicina = Integer.parseInt(kolicinaCijene);

        double ukupno = cijena * kolicina;
        // ukoliko unutar "košarice" ima više od 10 proizvoda (kolicina > 10), uračuna se 20% (ukupno *= 0.8)
        if (kolicina > 10) {
            ukupno *= 0.8;
        }
        System.out.println("Konačna cijena s popustom" + " " + ukupno);
    }
}
