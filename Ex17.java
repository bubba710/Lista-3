import java.util.Scanner;

public class Ex17 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        double reajuste = calcularReajuste(salario, salarioMinimo);
        double novoSalario = salario + reajuste;

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Reajuste: R$ " + reajuste);
        System.out.println("Novo salário: R$ " + novoSalario);

        double aumentoFolha = reajuste;
        System.out.println("\nAumento na folha de pagamento: R$ " + aumentoFolha);

        scanner.close();
    }

    public static double calcularReajuste(double salario, double salarioMinimo) {
        double percentual = 0.1; // 10% de reajuste
        double novoSalarioMinimo = salarioMinimo * (1 + percentual);
        return novoSalarioMinimo - salario;
    }
}
