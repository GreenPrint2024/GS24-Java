package Models;

public enum TIPO_TRANSPORTE_AEREO {
    AVIAO_DOMESTICO(0.35),
    AVIAO_INTERNACIONAL(0.16),
    HELICOPTERO(1.25);

    private final double emissao;

    TIPO_TRANSPORTE_AEREO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
