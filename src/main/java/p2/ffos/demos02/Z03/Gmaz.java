package p2.ffos.demos02.Z03;

public class Gmaz extends Fauna {

    private boolean jeHladnokrvan;
    private double debljinaTkiva;

    public boolean isJeHladnokrvan() {
        return jeHladnokrvan;
    }

    public void setJeHladnokrvan(boolean jeHladnokrvan) {
        this.jeHladnokrvan = jeHladnokrvan;
    }

    public double getDebljinaTkiva() {
        return debljinaTkiva;
    }

    public void setDebljinaTkiva(double debljinaTkiva) {
        this.debljinaTkiva = debljinaTkiva;
    }

    public Gmaz(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja, boolean jeHladnokrvan, double debljinaTkiva) {
        super(starost, jeZiv, staniste, brojNogu, brzinaKretanja);
        this.jeHladnokrvan = jeHladnokrvan;
        this.debljinaTkiva = debljinaTkiva;
    }
}
