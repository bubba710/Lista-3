import java.util.Scanner;

public class Ex14 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int produtos = 40;

        for (int i = 1; i <= produtos; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Preço de custo: ");
            double precoCusto = scanner.nextDouble();
            somaPrecoCusto += precoCusto;

            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();
            somaPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                System.out.println("Produto " + i + ": Lucro");
            } else if (precoVenda < precoCusto) {
                System.out.println("Produto " + i + ": Prejuízo");
            } else {
                System.out.println("Produto " + i + ": Empate");
            }
        }

        double mediaPrecoCusto = somaPrecoCusto / produtos;
        double mediaPrecoVenda = somaPrecoVenda / produtos;

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);

        scanner.close();
    }
}
