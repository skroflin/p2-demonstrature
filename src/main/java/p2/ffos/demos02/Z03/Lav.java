package p2.ffos.demos02.Z03;

public class Lav extends Sisavac {

    private double duljinaGrive;

    public double getDuljinaGrive() {
        return duljinaGrive;
    }

    public void setDuljinaGrive(double duljinaGrive) {
        this.duljinaGrive = duljinaGrive;
    }

    public Lav(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja, double tjelesnaTemperatura, String tipKrzna, double duljinaGrive) {
        super(starost, jeZiv, staniste, brojNogu, brzinaKretanja, tjelesnaTemperatura, tipKrzna);
        this.duljinaGrive = duljinaGrive;
    }
}
