package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransporteIndividualMotorizado extends Transporte{
    private TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO tipoTransporteIndividualMotorizado;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransporteIndividualMotorizado.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransporteIndividualMotorizado.getEmissao(),distancia * vezes);
    }

    public TransporteIndividualMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO tipoTransporteIndividualMotorizado) {
        this.tipoTransporteIndividualMotorizado = tipoTransporteIndividualMotorizado;
        this.setEmissaoCO2(tipoTransporteIndividualMotorizado.getEmissao());
    }

    public TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO getTipoTransporteIndividualMotorizado() {
        return tipoTransporteIndividualMotorizado;
    }

    public void setTipoTransporteIndividualMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO tipoTransporteIndividualMotorizado) {
        this.tipoTransporteIndividualMotorizado = tipoTransporteIndividualMotorizado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteIndividualMotorizado that = (TransporteIndividualMotorizado) o;
        return getTipoTransporteIndividualMotorizado() == that.getTipoTransporteIndividualMotorizado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransporteIndividualMotorizado());
    }

    @Override
    public String toString() {
        return "TransporteIndividualMotorizado{" +
                "tipoTransporteIndividualMotorizado=" + tipoTransporteIndividualMotorizado +
                '}';
    }
}
