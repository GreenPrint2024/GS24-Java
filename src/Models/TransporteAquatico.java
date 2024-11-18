package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransporteAquatico extends Transporte{
    private TIPO_TRANSPORTE_AQUATICO tipoTransporteAquatico;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransporteAquatico.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransporteAquatico.getEmissao(),distancia * vezes);
    }

    public TransporteAquatico(TIPO_TRANSPORTE_AQUATICO tipoTransporteAquatico) {
        this.tipoTransporteAquatico = tipoTransporteAquatico;
        this.setEmissaoCO2(tipoTransporteAquatico.getEmissao());
    }

    public TIPO_TRANSPORTE_AQUATICO getTipoTransporteAquatico() {
        return tipoTransporteAquatico;
    }

    public void setTipoTransporteAquatico(TIPO_TRANSPORTE_AQUATICO tipoTransporteAquatico) {
        this.tipoTransporteAquatico = tipoTransporteAquatico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteAquatico that = (TransporteAquatico) o;
        return getTipoTransporteAquatico() == that.getTipoTransporteAquatico();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransporteAquatico());
    }

    @Override
    public String toString() {
        return "TransporteAquatico{" +
                "tipoTransporteAquatico=" + tipoTransporteAquatico +
                '}';
    }
}
