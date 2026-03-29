package p2.ffos.demos02.Z03;

public class Fauna extends Organizam {

    private int brojNogu;
    private double brzinaKretanja;

    public int getBrojNogu() {
        return brojNogu;
    }

    public void setBrojNogu(int brojNogu) {
        this.brojNogu = brojNogu;
    }

    public double getBrzinaKretanja() {
        return brzinaKretanja;
    }

    public void setBrzinaKretanja(double brzinaKretanja) {
        this.brzinaKretanja = brzinaKretanja;
    }

    public Fauna(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja) {
        super(starost, jeZiv, staniste);
        this.brojNogu = brojNogu;
        this.brzinaKretanja = brzinaKretanja;
    }
}
