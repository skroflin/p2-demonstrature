package p2.ffos.demos01;

public class Z06 {
    public static void main(String[] args) {
        double[] temp = {12.5, 14.0, 13.2, 15.7, 11.2, 10.5, 9.8};
        double suma = 0;

        //koristimo foreach petlju za iteraciju kroz jednodimenzionalni niz
        //potom, koristimo pridruživanje sa zbrajanjem kako bi sve zbrojili
        for (double t : temp) {
            suma += t;
        }

        //definiramo novu varijablu tipa double (decimalni broj), gdje dijelimo sumu sa dužinom niza (length)
        double prosjek = suma / temp.length;
        System.out.println("Prosječna temperatura tjedna iznosi" + " " + String.format("%.2f", prosjek)); // "%.2f" - formatiranje float tipa broja, gdje zaokružujemo na 2 decimale
    }
}
