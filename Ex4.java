import java.util.Scanner;

public class Ex4 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = cotacaoDolar * quantidadeDolares;

        System.out.println("Valor em reais (R$): " + valorEmReais);

        scanner.close();
    }
}
