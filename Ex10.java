import java.util.Scanner;

public class Ex10 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão avaliadas? ");
        int numeroPessoas = scanner.nextInt();

        for (int i = 0; i < numeroPessoas; i++) {
            System.out.println("Digite a idade da " + (i + 1) + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }

        scanner.close();
    }
}
