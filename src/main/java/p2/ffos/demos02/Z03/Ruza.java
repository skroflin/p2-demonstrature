package p2.ffos.demos02.Z03;

public class Ruza extends Cvjetnjaca {

    private int brojTrnova;

    public int getBrojTrnova() {
        return brojTrnova;
    }

    public void setBrojTrnova(int brojTrnova) {
        this.brojTrnova = brojTrnova;
    }

    public Ruza(double starost, boolean jeZiv, String staniste, boolean imaKorijen, double visinaStabiljke, String boja, boolean miris, int brojTrnova) {
        super(starost, jeZiv, staniste, imaKorijen, visinaStabiljke, boja, miris);
        this.brojTrnova = brojTrnova;
    }
}
