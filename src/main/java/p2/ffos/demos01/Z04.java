package p2.ffos.demos01;

import javax.swing.*;

public class Z04 {
    public static void main(String[] args) {
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite cijeli broj"));
        int oBroj = broj;
        int zbroj = 0;

        //koristimo while petlju, jer ne znamo koliko broj ima znamenki
        while (broj > 0) {
            zbroj += broj % 10;
            broj /= 10;
        }

        System.out.println("Zbroj znamenki broja" + " " + oBroj + " " + "iznosi:" + " " + zbroj);
    }
}
