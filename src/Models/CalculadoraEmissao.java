package Models;

public class CalculadoraEmissao {

    public static double calcularEmissao(double consumo, double fator) {
        return consumo * fator;
    }

    public static void calcularEmissaoCarbono(Usuario usuario) {
        double emissaoTransporte = usuario.getMeioTransportePrincipal().calcularEmissaoTransporte();

        double emissaoEnergia = usuario.getMoradiaPrincipal().calcularEmissaoEnergia();

        double emissaoAlimentos = usuario.getMoradiaPrincipal().calcularEmissaoAlimentos();

        double totalEmissao = emissaoTransporte + emissaoEnergia + emissaoAlimentos;

        System.out.println("\nEmissões de CO2 geradas:");
        System.out.println("Transporte: " + emissaoTransporte + " kgCO2");
        System.out.println("Energia: " + emissaoEnergia + " kgCO2");
        System.out.println("Alimentos: " + emissaoAlimentos + " kg");
        System.out.println("Total de emissões: " + totalEmissao + " kg");
    }
}
