package p2.ffos.demos02;

import javax.swing.*;

public class Z01 {
    public static void main(String[] args) {
        //definiramo boolean vrijednost s default vrijednošću
        boolean uspjeh = false;

        //uvijek dok vrijednost nije istinita (ili ispunjena) program se vrti
        //e.g. iskočni prozorčići (GUI) se pojavljuju
        while (!uspjeh) {
            try {
                int broj01 = Integer.parseInt(JOptionPane.showInputDialog("Unesite djeljenik:"));
                int broj02 = Integer.parseInt(JOptionPane.showInputDialog("Unesite djelitelj:"));

                int rezultat = broj01 / broj02;
                System.out.println("Rezultat je:" + " " + rezultat);

                //ukoliko dođe do try bloka, program vrši dijeljenje
                //ako su uvjeti zadovoljeni mijenja se vrijednost iz false u true
                uspjeh = true;
            } catch (NumberFormatException e) {
                System.out.println("Greška: morate unijeti broj!");
            } catch (ArithmeticException e) {
                System.out.println("Greška: nije dozvoljeno dijeljenje s nulom!");
            } catch (Exception e) {
                System.out.println("Dogodila se neočekivana greška!");
            }
        }
    }
}
