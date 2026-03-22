package p2.ffos.demos01;

public class Z07 {
    public static void main(String[] args) {
        int[] brojevi = {5, 12, 3, 45, 33, 23, 21, 19, 30, 11};
        //inline definiramo minimalnu i maksimalnu vrijednost n broja niza
        int min = brojevi[0], max = brojevi[0];

        //for nas dovodi do niza "brojevi"
        for (int i = 1; i < brojevi.length; i ++) {
            //if služi za uspoređivanje najmanjeg broja s idućim
            if (brojevi[i] < min) min = brojevi[i];
            //if služi za uspoređivanje najvećeg broja s idućim
            if (brojevi[i] > max) max = brojevi[i];
        }
        System.out.println("Najmanji broj:" + " " + min);
        System.out.println("Najveći broj:" + " " + max);
    }
}
