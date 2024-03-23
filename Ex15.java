import java.util.Scanner;

public class Ex15 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;
        double valorVeiculo;

        do {
            System.out.println("Digite o valor do veículo (0 para encerrar): ");
            valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Digite o tipo de combustível (álcool, gasolina, diesel): ");
            String tipoCombustivel = scanner.next().toLowerCase();

            double desconto;
            switch (tipoCombustivel) {
                case "álcool":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido. Tente novamente.");
                    continue;
            }

            totalDesconto += desconto;
            double valorAPagar = valorVeiculo - desconto;
            totalPago += valorAPagar;

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a ser pago: R$ " + valorAPagar);
        } while (valorVeiculo != 0);

        System.out.println("\nTotal de desconto: R$ " + totalDesconto);
        System.out.println("Total pago pelos clientes: R$ " + totalPago);

        scanner.close();
    }
}
