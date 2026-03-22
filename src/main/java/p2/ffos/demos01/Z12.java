package p2.ffos.demos01;

import javax.swing.*;

public class Z12 {
    public static void main(String[] args) {
        int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj (3-999):"));
        if (broj <= 2 || broj >= 1000) {
            System.out.println("Broj mora biti između 2 i 1000!");
        }

        int zbrojDjelitelja = 0;
        String djeliteljIspis = "";

        for (int i = 1; i < broj; i++) {
            if (broj % i == 0) {
                zbrojDjelitelja += i;
                djeliteljIspis += i + " ";
            }
        }

        if (zbrojDjelitelja == broj) {
            System.out.println("Broj" + " " + broj + " " + "je savršen\n" + "Djelitelji" + " " + djeliteljIspis + "\n" + "Zbroj:" + " " + zbrojDjelitelja);
        } else {
            System.out.println("Broj" + " " + broj + " " + "nije savršen\n" + "Zbroj njegovih djelitelja je" + " " + zbrojDjelitelja);
        }
    }
}
