import java.util.Scanner;

public class Ex3 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas (em dinheiro): ");
        double totalVendas = scanner.nextDouble();

        double comissao = 0.15 * totalVendas;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("\nNome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário no final do mês: R$ " + salarioFinal);

        scanner.close();
    }
}
