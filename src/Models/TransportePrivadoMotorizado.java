package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransportePrivadoMotorizado extends Transporte{
    private TIPO_TRANSPORTE_PRIVADO_MOTORIZADO tipoTransportePrivadoMotorizado;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransportePrivadoMotorizado.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransportePrivadoMotorizado.getEmissao(),distancia * vezes);
    }

    public TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO tipoTransportePrivadoMotorizado) {
        this.tipoTransportePrivadoMotorizado = tipoTransportePrivadoMotorizado;
        this.setEmissaoCO2(tipoTransportePrivadoMotorizado.getEmissao());
    }

    public TIPO_TRANSPORTE_PRIVADO_MOTORIZADO getTipoTransportePrivadoMotorizado() {
        return tipoTransportePrivadoMotorizado;
    }

    public void setTipoTransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO tipoTransportePrivadoMotorizado) {
        this.tipoTransportePrivadoMotorizado = tipoTransportePrivadoMotorizado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportePrivadoMotorizado that = (TransportePrivadoMotorizado) o;
        return getTipoTransportePrivadoMotorizado() == that.getTipoTransportePrivadoMotorizado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransportePrivadoMotorizado());
    }

    @Override
    public String toString() {
        return "TransportePrivadoMotorizado{" +
                "tipoTransportePrivadoMotorizado=" + tipoTransportePrivadoMotorizado +
                '}';
    }
}
