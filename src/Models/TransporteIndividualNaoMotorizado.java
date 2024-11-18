package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransporteIndividualNaoMotorizado extends Transporte{
    private TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO tipoTransporteIndividualNMotorizado;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransporteIndividualNMotorizado.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransporteIndividualNMotorizado.getEmissao(),distancia * vezes);
    }

    public TransporteIndividualNaoMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO tipoTransporteIndividualNMotorizado) {
        this.tipoTransporteIndividualNMotorizado = tipoTransporteIndividualNMotorizado;
        this.setEmissaoCO2(tipoTransporteIndividualNMotorizado.getEmissao());
    }

    public TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO getTipoTransporteIndividualNMotorizado() {
        return tipoTransporteIndividualNMotorizado;
    }

    public void setTipoTransporteIndividualNMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO tipoTransporteIndividualNMotorizado) {
        this.tipoTransporteIndividualNMotorizado = tipoTransporteIndividualNMotorizado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransporteIndividualNaoMotorizado that = (TransporteIndividualNaoMotorizado) o;
        return getTipoTransporteIndividualNMotorizado() == that.getTipoTransporteIndividualNMotorizado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransporteIndividualNMotorizado());
    }

    @Override
    public String toString() {
        return "TransporteIndividualNaoMotorizado{" +
                "tipoTransporteIndividualNMotorizado=" + tipoTransporteIndividualNMotorizado +
                '}';
    }
}
