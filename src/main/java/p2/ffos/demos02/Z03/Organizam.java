package p2.ffos.demos02.Z03;

public class Organizam {

    private double starost;
    private boolean jeZiv;
    private String staniste;

    public double getStarost() {
        return starost;
    }

    public void setStarost(double starost) {
        this.starost = starost;
    }

    public boolean isJeZiv() {
        return jeZiv;
    }

    public void setJeZiv(boolean jeZiv) {
        this.jeZiv = jeZiv;
    }

    public String getStaniste() {
        return staniste;
    }

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    public Organizam(double starost, boolean jeZiv, String staniste) {
        this.starost = starost;
        this.jeZiv = jeZiv;
        this.staniste = staniste;
    }
}
