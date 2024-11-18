package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransporteAereo extends Transporte{
    private TIPO_TRANSPORTE_AEREO tipoTransporteAereo;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransporteAereo.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransporteAereo.getEmissao(),distancia * vezes);
    }

    public TransporteAereo(TIPO_TRANSPORTE_AEREO tipoTransporteAereo) {
        this.tipoTransporteAereo = tipoTransporteAereo;
        this.setEmissaoCO2(tipoTransporteAereo.getEmissao());
    }

    public TIPO_TRANSPORTE_AEREO getTipoTransporteAereo() {
        return tipoTransporteAereo;
    }

    public void setTipoTransporteAereo(TIPO_TRANSPORTE_AEREO tipoTransporteAereo) {
        this.tipoTransporteAereo = tipoTransporteAereo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteAereo that = (TransporteAereo) o;
        return getTipoTransporteAereo() == that.getTipoTransporteAereo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransporteAereo());
    }

    @Override
    public String toString() {
        return "TransporteAereo{" +
                "tipoTransporteAereo=" + tipoTransporteAereo +
                '}';
    }
}
