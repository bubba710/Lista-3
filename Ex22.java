import java.util.Scanner;

public class Ex22 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipos de cliente:");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");

        System.out.println("Digite o tipo de cliente (1, 2 ou 3): ");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite o consumo de energia em KW/h: ");
        double consumoEnergia = scanner.nextDouble();

        double valorKWh = obterValorKWh(tipoCliente);
        if (valorKWh != -1) {
            double valorConta = consumoEnergia * valorKWh;
            System.out.println("O valor da conta de luz é: R$ " + valorConta);
        } else {
            System.out.println("Tipo de cliente inválido.");
        }

        scanner.close();
    }

    public static double obterValorKWh(int tipoCliente) {
        switch (tipoCliente) {
            case 1:
                return 0.602;
            case 2:
                return 0.483;
            case 3:
                return 1.29;
            default:
                return -1;
        }
    }
}
