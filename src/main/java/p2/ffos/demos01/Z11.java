package p2.ffos.demos01;

import javax.swing.*;

public class Z11 {
    public static void main(String[] args) {
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
        boolean provjera = true;

        if (broj < 2) {
            provjera = false;
        } else {
            for (int i = 2; i <= Math.sqrt(broj); i ++) {
                if (broj % i == 0) {
                    provjera = false;
                    break;
                }
            }
        }

        if (!provjera) {
            System.out.println(broj + " " + "nije prime broj!");
        } else {
            System.out.println(broj + " " + "je prime broj!");
        }
    }
}
