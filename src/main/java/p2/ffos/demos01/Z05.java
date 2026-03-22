package p2.ffos.demos01;

import javax.swing.*;

public class Z05 {
    public static void main(String[] args) {
        int unos;
        do {
            unos = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj između 1 i 10:"));
        } while (unos < 1 || unos > 10);

        System.out.println("Uspješno unesen broj:" + " " + unos);
    }
}
