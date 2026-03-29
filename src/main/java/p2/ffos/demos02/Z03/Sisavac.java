package p2.ffos.demos02.Z03;

public class Sisavac extends Fauna {

    private double tjelesnaTemperatura;
    private String tipKrzna;

    public double getTjelesnaTemperatura() {
        return tjelesnaTemperatura;
    }

    public void setTjelesnaTemperatura(double tjelesnaTemperatura) {
        this.tjelesnaTemperatura = tjelesnaTemperatura;
    }

    public String getTipKrzna() {
        return tipKrzna;
    }

    public void setTipKrzna(String tipKrzna) {
        this.tipKrzna = tipKrzna;
    }

    public Sisavac(double starost, boolean jeZiv, String staniste, int brojNogu, double brzinaKretanja, double tjelesnaTemperatura, String tipKrzna) {
        super(starost, jeZiv, staniste, brojNogu, brzinaKretanja);
        this.tjelesnaTemperatura = tjelesnaTemperatura;
        this.tipKrzna = tipKrzna;
    }
}
