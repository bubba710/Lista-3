import java.util.Scanner;

public class Ex20 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas/aula ministradas: ");
        int horasAula = scanner.nextInt();

        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        int nivel = scanner.nextInt();

        double salario = calcularSalario(horasAula, nivel);
        System.out.println("O salário do professor é: R$ " + salario);

        scanner.close();
    }

    public static double calcularSalario(int horasAula, int nivel) {
        double valorHoraAula;

        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido.");
                return 0.0; // Retorna 0 se o nível for inválido
        }

        return valorHoraAula * horasAula;
    }
}
