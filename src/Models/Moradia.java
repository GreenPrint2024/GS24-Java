package Models;

import java.util.Scanner;

public class Moradia {

    private double consumoEnergia; // kWh/mês
    private double consumoGasNatural; // m³/mês
    private double consumoGlp; // kg/mês

    // Construtor
    public Moradia(double consumoEnergia, double consumoGasNatural, double consumoGlp) {
        this.consumoEnergia = consumoEnergia;
        this.consumoGasNatural = consumoGasNatural;
        this.consumoGlp = consumoGlp;
    }

    public double calcularEmissaoEnergia() {
        double emissaoEnergia = CalculadoraEmissao.calcularEmissao(consumoEnergia, 0.5);
        double emissaoGasNatural = CalculadoraEmissao.calcularEmissao(consumoGasNatural, 2.2);
        double emissaoGlp = CalculadoraEmissao.calcularEmissao(consumoGlp, 3.0);
        return emissaoEnergia + emissaoGasNatural + emissaoGlp;
    }

    public double calcularEmissaoAlimentos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas vezes por semana você consome carne vermelha?");
        int porcoesCarneVermelha = scanner.nextInt();
        double emissaoCarneVermelha = CalculadoraEmissao.calcularEmissao(porcoesCarneVermelha, 4.5);

        System.out.println("Quantas vezes por semana você consome frango?");
        int porcoesFrango = scanner.nextInt();
        double emissaoFrango = CalculadoraEmissao.calcularEmissao(porcoesFrango, 1.1);

        System.out.println("Quantas vezes por semana você consome peixe?");
        int porcoesPeixe = scanner.nextInt();
        double emissaoPeixe = CalculadoraEmissao.calcularEmissao(porcoesPeixe, 1.5);

        System.out.println("Quantas vezes por semana você consome ovos/laticínios?");
        int porcoesOvosLaticinios = scanner.nextInt();
        double emissaoOvosLaticinios = CalculadoraEmissao.calcularEmissao(porcoesOvosLaticinios, 0.5);

        return emissaoCarneVermelha + emissaoFrango + emissaoPeixe + emissaoOvosLaticinios;
    }
}
