import java.util.Scanner;

public class Ex18 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();

        double abono;

        if (sexo == 'M') {
            if (idade >= 30) {
                abono = 100.00;
            } else {
                abono = 50.00;
            }
        } else { // Sexo 'F'
            if (idade >= 30) {
                abono = 200.00;
            } else {
                abono = 80.00;
            }
        }

        double salarioLiquido = salarioFixo + abono;

        System.out.println("\nNome do funcionário: " + nome);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
