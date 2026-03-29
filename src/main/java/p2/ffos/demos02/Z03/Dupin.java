package p2.ffos.demos02.Z03;

public class Dupin extends Sisavac {

    private int frekvencijaEholokacije;

    public int getFrekvencijaEholokacije() {
        return frekvencijaEholokacije;
    }

    public void setFrekvencijaEholokacije(int frekvencijaEholokacije) {
        this.frekvencijaEholokacije = frekvencijaEholokacije;
    }

    public Dupin(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja, double tjelesnaTemperatura, String tipKrzna, int frekvencijaEholokacije) {
        super(starost, jeZiv, staniste, brojNogu, brzinaKretanja, tjelesnaTemperatura, tipKrzna);
        this.frekvencijaEholokacije = frekvencijaEholokacije;
    }
}
