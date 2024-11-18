package Models;

public enum TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO {
    BICICLETA(0),
    A_PE(0);

    private final double emissao;

    TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
