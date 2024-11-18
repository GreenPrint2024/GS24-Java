package Models;

import java.util.Objects;

public class Transporte {
    private double emissaoCO2;

    public double calcularEmissaoTransporte() {
        return 0;
    }

    public double getEmissaoCO2() {
        return emissaoCO2;
    }

    public void setEmissaoCO2(double emissaoCO2) {
        this.emissaoCO2 = emissaoCO2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transporte that = (Transporte) o;
        return Double.compare(getEmissaoCO2(), that.getEmissaoCO2()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getEmissaoCO2());
    }

    @Override
    public String toString() {
        return "Transporte{" +
                "emissaoCO2=" + emissaoCO2 +
                '}';
    }
}
