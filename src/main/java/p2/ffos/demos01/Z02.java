package p2.ffos.demos01;

import javax.swing.*;

public class Z02 {
    public static void main(String[] args) {
        int dan = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj dana (1-7)"));
        //definiramo varijablu poruka, gdje postavljamo uvjetno grananje
        //ukoliko se unesu brojevi (1-5) ispisuje se poruka "Radni dan"
        //ukoliko se unesu brojevi (6-7) ispisuje se poruka "Vikend"
        String poruka = switch (dan) {
            case 1, 2, 3, 4, 5 -> "Radni dan";
            case 6, 7 -> "Vikend";
            default -> "Neispravan unos";
        };

        System.out.println(poruka);
    }
}
