import java.util.Scanner;

public class Ex8 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        String mencao = calcularMencao(media);

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Menção: " + mencao);
        scanner.close();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static String calcularMencao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media <= 5) {
            return "Reprovado";
        } else {
            return "Recuperação";
        }
    }
}
