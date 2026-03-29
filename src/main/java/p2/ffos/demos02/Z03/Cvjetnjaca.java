package p2.ffos.demos02.Z03;

public class Cvjetnjaca extends Flora {

    private String boja;
    private boolean miris;

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isMiris() {
        return miris;
    }

    public void setMiris(boolean miris) {
        this.miris = miris;
    }

    public Cvjetnjaca(double starost, boolean jeZiv, String staniste, boolean imaKorijen, double visinaStabiljke, String boja, boolean miris) {
        super(starost, jeZiv, staniste, imaKorijen, visinaStabiljke);
        this.boja = boja;
        this.miris = miris;
    }
}
