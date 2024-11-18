package Models;

public enum TIPO_TRANSPORTE_PRIVADO_MOTORIZADO {
    CARRO_GASOLINA(0.23),
    CARRO_DIESEL(0.28),
    CARRO_ELETRICO(0.1),
    MOTO_GASOLINA(0.13),
    MOTO_ELETRICA(0.02);

    private final double emissao;

    TIPO_TRANSPORTE_PRIVADO_MOTORIZADO(double emissao) {
        this.emissao = emissao;
    }

    public double getEmissao() {
        return emissao;
    }
}
