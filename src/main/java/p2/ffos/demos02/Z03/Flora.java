package p2.ffos.demos02.Z03;

public class Flora extends Organizam {

    private boolean imaKorijen;
    private double visinaStabiljke;

    public boolean isImaKorijen() {
        return imaKorijen;
    }

    public void setImaKorijen(boolean imaKorijen) {
        this.imaKorijen = imaKorijen;
    }

    public double getVisinaStabiljke() {
        return visinaStabiljke;
    }

    public void setVisinaStabiljke(double visinaStabiljke) {
        this.visinaStabiljke = visinaStabiljke;
    }

    public Flora(double starost, boolean jeZiv, String staniste, boolean imaKorijen, double visinaStabiljke) {
        super(starost, jeZiv, staniste);
        this.imaKorijen = imaKorijen;
        this.visinaStabiljke = visinaStabiljke;
    }
}
