package p2.ffos.demos02.Z03;

public class Krokodil extends Gmaz {

    private double snagaUgriza;

    public double getSnagaUgriza() {
        return snagaUgriza;
    }

    public void setSnagaUgriza(double snagaUgriza) {
        this.snagaUgriza = snagaUgriza;
    }

    public Krokodil(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja, boolean jeHladnokrvan, double debljinaTkiva, double snagaUgriza) {
        super(starost, jeZiv, staniste, brojNogu, brzinaKretanja, jeHladnokrvan, debljinaTkiva);
        this.snagaUgriza = snagaUgriza;
    }
}
