package Models;

public enum TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO {
    PATINETE_ELETRICO(0.012),
    SCOOTER_ELETRICA(0.03);

    private final double emissao;

    TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
