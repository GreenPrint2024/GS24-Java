package Models;

public enum TIPO_TRANSPORTE_AQUATICO {
    BARCO_PRIVADO(0.3),
    CANOA_KAYAK(0);

    private final double emissao;

    TIPO_TRANSPORTE_AQUATICO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
