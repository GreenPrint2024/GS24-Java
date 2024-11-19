package Main;

import Models.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\nBem vindo ao greenprint, calculadora de emissão de carbono");
                System.out.println("Para começar, escreva seu nome:");
                var nome = scanner.nextLine();
                var idade = 0;
                var kwh = 0;
                var gasNatural = 0;
                var glp = 0;

                while (true) {
                    try {
                        System.out.println("Agora escreva sua idade:");
                        idade = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.println("Quantos kWh você consome por mês?");
                        kwh = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.println("Quantos m³ de gás natural você utiliza por mês?");
                        gasNatural = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.println("Quantos kg de GLP você utiliza por mês?");
                        glp = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.nextLine();
                    }
                }

                while (true) {
                    try {
                        System.out.println("""
                                Escolha seu meio de tranporte principal:
                                1. Avião doméstico
                                2. Avião internacional
                                3. Helicóptero
                                4. Barco privado
                                5. Canoa/Kayak
                                6. Carona compartilhada
                                7. Transporte por aplicativo (carro)
                                8. Patinete elétrico
                                9. Scooter elétrica
                                10. Bicicleta
                                11. A pé
                                12. Carro a gasolina
                                13. Carro a diesel
                                14. Carro elétrico
                                15. Moto a gasolina
                                16. Moto elétrica
                                17. Ônibus
                                18. Metrô
                                19. Trem
                                20. VLT (Veículo Leve sobre Trilhos)
                                21. Barco
                                0. Sair
                                =========================================================
                                Digite a opção desejada:""");

                        var opcao = scanner.nextInt();
                        var transporteEscolhido = new Transporte();

                        switch (opcao) {
                            case 0 -> System.out.println("Saindo");
                            case 1 -> transporteEscolhido = new TransporteAereo(TIPO_TRANSPORTE_AEREO.AVIAO_DOMESTICO);
                            case 2 ->
                                    transporteEscolhido = new TransporteAereo(TIPO_TRANSPORTE_AEREO.AVIAO_INTERNACIONAL);
                            case 3 -> transporteEscolhido = new TransporteAereo(TIPO_TRANSPORTE_AEREO.HELICOPTERO);
                            case 4 ->
                                    transporteEscolhido = new TransporteAquatico(TIPO_TRANSPORTE_AQUATICO.BARCO_PRIVADO);
                            case 5 ->
                                    transporteEscolhido = new TransporteAquatico(TIPO_TRANSPORTE_AQUATICO.CANOA_KAYAK);
                            case 6 ->
                                    transporteEscolhido = new TransporteCompartilhado(TIPO_TRANSPORTE_COMPARTILHADO.CARONA_COMPARTILHADA);
                            case 7 ->
                                    transporteEscolhido = new TransporteCompartilhado(TIPO_TRANSPORTE_COMPARTILHADO.TRANSPORTE_APP);
                            case 8 ->
                                    transporteEscolhido = new TransporteIndividualMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO.PATINETE_ELETRICO);
                            case 9 ->
                                    transporteEscolhido = new TransporteIndividualMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_MOTORIZADO.SCOOTER_ELETRICA);
                            case 10 ->
                                    transporteEscolhido = new TransporteIndividualNaoMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO.BICICLETA);
                            case 11 ->
                                    transporteEscolhido = new TransporteIndividualNaoMotorizado(TIPO_TRANSPORTE_INDIVIDUAL_N_MOTORIZADO.A_PE);
                            case 12 ->
                                    transporteEscolhido = new TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO.CARRO_GASOLINA);
                            case 13 ->
                                    transporteEscolhido = new TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO.CARRO_DIESEL);
                            case 14 ->
                                    transporteEscolhido = new TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO.CARRO_ELETRICO);
                            case 15 ->
                                    transporteEscolhido = new TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO.MOTO_GASOLINA);
                            case 16 ->
                                    transporteEscolhido = new TransportePrivadoMotorizado(TIPO_TRANSPORTE_PRIVADO_MOTORIZADO.MOTO_ELETRICA);
                            case 17 -> transporteEscolhido = new TransportePublico(TIPO_TRANSPORTE_PUBLICO.ONIBUS);
                            case 18 -> transporteEscolhido = new TransportePublico(TIPO_TRANSPORTE_PUBLICO.METRO);
                            case 19 -> transporteEscolhido = new TransportePublico(TIPO_TRANSPORTE_PUBLICO.TREM);
                            case 20 -> transporteEscolhido = new TransportePublico(TIPO_TRANSPORTE_PUBLICO.VLT);
                            case 21 -> transporteEscolhido = new TransportePublico(TIPO_TRANSPORTE_PUBLICO.BARCO);
                            default -> System.out.println("Opção Inválida");
                        }

                        if (1 <= opcao && opcao <= 21) {
                            var usuario = new Usuario(nome, idade, transporteEscolhido, new Moradia(kwh, gasNatural, glp));

                            CalculadoraEmissao.calcularEmissaoCarbono(usuario);
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido");
                        scanner.nextLine();
                    }
                }

                System.out.println("""
                        
                        Fazer novo calculo?
                        1. Sim
                        0. Não
                        Digite a opção desejada:""");
                var escolha = scanner.nextInt();

                switch (escolha) {
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    case 1:
                        scanner.nextLine();
                        continue;
                    default:
                        System.out.println("Opção inválida");
                }
                if (escolha == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido1");
                scanner.nextLine();
            }
        }
    }
}
