package Models;

public enum TIPO_TRANSPORTE_PUBLICO {
    ONIBUS(0.10),
    METRO(0.075),
    TREM(0.06),
    VLT(0.06),
    BARCO(0.20);

    private final double emissao;

    TIPO_TRANSPORTE_PUBLICO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
