package Models;

public class CalculadoraEmissao {

    public static double calcularEmissao(double consumo, double fator) {
        return consumo * fator;
    }

    public static void calcularEmissaoCarbono(Usuario usuario) {
        // Calcular emissões relacionadas ao transporte
        double emissaoTransporte = usuario.getMeioTransportePrincipal().calcularEmissaoTransporte();

        // Calcular emissões relacionadas à energia
        double emissaoEnergia = usuario.getMoradiaPrincipal().calcularEmissaoEnergia();

        // Calcular emissões relacionadas aos alimentos
        double emissaoAlimentos = usuario.getMoradiaPrincipal().calcularEmissaoAlimentos();

        // Total de emissões
        double totalEmissao = emissaoTransporte + emissaoEnergia + emissaoAlimentos;

        // Exibir os resultados
        System.out.println("Emissões de CO2 geradas:");
        System.out.println("Transporte: " + emissaoTransporte + " kgCO2");
        System.out.println("Energia: " + emissaoEnergia + " kgCO2");
        System.out.println("Alimentos: " + emissaoAlimentos + " kg");
        System.out.println("Total de emissões: " + totalEmissao + " kg");
    }
}
