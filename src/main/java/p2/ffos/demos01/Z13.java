package p2.ffos.demos01;

import javax.swing.*;

public class Z13 {
    public static void main(String[] args) {
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj (3-9999):"));

        if (broj <= 2 || broj >= 10000) {
            System.out.println("Broj nije u traženom rasponu");
        }

        int privremeniBroj = broj;
        int zbroj = 0;

        String stringBroj = String.valueOf(broj);
        int brojZnamenki = stringBroj.length();

        while (privremeniBroj > 0) {
            int znamenka = privremeniBroj % 10;
            zbroj += (int) Math.pow(znamenka, brojZnamenki);
            privremeniBroj /= 10;
        }

        if (zbroj == broj) {
            System.out.println(broj + " " + "je Armstrongov broj");
        } else {
            System.out.println(broj + " " + "nije Armstrongov broj");
        }
    }
}
