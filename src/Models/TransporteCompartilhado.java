package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransporteCompartilhado extends Transporte{
    private TIPO_TRANSPORTE_COMPARTILHADO tipoTransporteCompartilhado;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransporteCompartilhado.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransporteCompartilhado.getEmissao(),distancia * vezes);
    }

    public TransporteCompartilhado(TIPO_TRANSPORTE_COMPARTILHADO tipoTransporteCompartilhado) {
        this.tipoTransporteCompartilhado = tipoTransporteCompartilhado;
        this.setEmissaoCO2(tipoTransporteCompartilhado.getEmissao());
    }

    public TIPO_TRANSPORTE_COMPARTILHADO getTipoTransporteCompartilhado() {
        return tipoTransporteCompartilhado;
    }

    public void setTipoTransporteCompartilhado(TIPO_TRANSPORTE_COMPARTILHADO tipoTransporteCompartilhado) {
        this.tipoTransporteCompartilhado = tipoTransporteCompartilhado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteCompartilhado that = (TransporteCompartilhado) o;
        return getTipoTransporteCompartilhado() == that.getTipoTransporteCompartilhado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransporteCompartilhado());
    }

    @Override
    public String toString() {
        return "TransporteCompartilhado{" +
                "tipoTransporteCompartilhado=" + tipoTransporteCompartilhado +
                '}';
    }
}
