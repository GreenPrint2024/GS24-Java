package Models;

import java.util.Objects;
import java.util.Scanner;

public class TransportePublico extends Transporte{
    private TIPO_TRANSPORTE_PUBLICO tipoTransportePublico;

    @Override
    public double calcularEmissaoTransporte() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Quantas vezes voce viaja de %s:%n", tipoTransportePublico.toString());
        var vezes = scanner.nextInt();
        System.out.println("Distância de viagem:");
        var distancia = scanner.nextDouble();
        return CalculadoraEmissao.calcularEmissao(tipoTransportePublico.getEmissao(),distancia * vezes);
    }

    public TransportePublico(TIPO_TRANSPORTE_PUBLICO tipoTransportePublico) {
        this.tipoTransportePublico = tipoTransportePublico;
        this.setEmissaoCO2(tipoTransportePublico.getEmissao());
    }

    public TIPO_TRANSPORTE_PUBLICO getTipoTransportePublico() {
        return tipoTransportePublico;
    }

    public void setTipoTransportePublico(TIPO_TRANSPORTE_PUBLICO tipoTransportePublico) {
        this.tipoTransportePublico = tipoTransportePublico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransportePublico that = (TransportePublico) o;
        return getTipoTransportePublico() == that.getTipoTransportePublico();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTipoTransportePublico());
    }

    @Override
    public String toString() {
        return "TransportePublico{" +
                "tipoTransportePublico=" + tipoTransportePublico +
                '}';
    }
}
