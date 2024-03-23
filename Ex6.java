import java.util.Scanner;

public class Ex6 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.println("Digite o percentual de acréscimo (em %): ");
        double percentualAcrescimo = scanner.nextDouble();

        double acrescimo = precoCusto * (percentualAcrescimo / 100);
        double precoVenda = precoCusto + acrescimo;

        System.out.println("O valor de venda do produto é: R$ " + precoVenda);

        scanner.close();
    }
}
