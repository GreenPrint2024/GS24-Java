package Models;

public enum TIPO_TRANSPORTE_COMPARTILHADO {
    CARONA_COMPARTILHADA(0.23),
    TRANSPORTE_APP(0.28);

    private final double emissao;

    TIPO_TRANSPORTE_COMPARTILHADO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
