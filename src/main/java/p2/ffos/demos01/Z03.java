package p2.ffos.demos01;

import javax.swing.*;

public class Z03 {
    public static void main(String[] args) {
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj:"));
        String rezultat = "Tablica zbrajanja za" + " " + broj + ":\n";

        for (int i = 1; i <= 10; i++){
            rezultat += broj + " + " + i + " = " + (broj+i) + "\n";
        }
        System.out.println(rezultat);
    }
}
