package p2.ffos.demos02;

import javax.swing.*;

public class Z02 {
    public static void main(String[] args) {
        int dob = cijeliBroj("Unesite vašu dob:");
        double placa = decimalniBroj("Unesite vašu plaću");

        System.out.println("Vaša dob:" + " " + dob);
        System.out.println("Vaša plaća" + " " + placa);
    }

    public static int cijeliBroj(String poruka) {
        //sve dok se ne zadovolji vrijednost - unos cijelog broja, blok se neprestano vrti
        while (true) { //neće se ukazati unutar main-a sve dok se ne ponudi ono što je traženo - cijeli broj
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                System.out.println("Greška: unesite cijeli broj!");
            }
        }
    }

    public static double decimalniBroj(String poruka) {
        //sve dok se ne zadovolji vrijednost - unos decimalnog broja, blok se neprestano vrti
        while (true) { //neće se ukazati unutar main-a sve dok se ne ponudi ono što je traženo - decimalni broj
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(poruka));
            } catch (Exception e) {
                System.out.println("Greška: unesite decimalni broj!");
            }
        }
    }
}
