package p2.ffos.demos01;

import javax.swing.*;

public class Z02 {
    public static void main(String[] args) {
        int dan = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj dana (1-7)"));
        String poruka = switch (dan) {
            case 1, 2, 3, 4, 5 -> "Radni dan";
            case 6, 7 -> "Vikend";
            default -> "Neispravan unos";
        };

        System.out.println(poruka);
    }
}
