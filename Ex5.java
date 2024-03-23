import java.util.Scanner;

public class Ex5 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("Valor de cada prestação (sem juros): " + valorPrestacao);

        scanner.close();
    }
}