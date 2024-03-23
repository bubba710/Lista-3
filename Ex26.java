import java.util.Scanner;

public class Ex26 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        if (idade >= 17 && idade <= 70) {
            System.out.println("Digite o grupo de risco (Baixo = 1, Médio = 2, Alto = 3): ");
            int grupoRisco = scanner.nextInt();

            int categoria = determinarCategoria(idade, grupoRisco);

            if (categoria != -1) {
                System.out.println("\nDados do pretendente:");
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Grupo de risco: " + grupoRisco);
                System.out.println("Categoria de seguro: " + categoria);
            } else {
                System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
            }
        } else {
            System.out.println("O pretendente não se enquadra na faixa etária necessária.");
        }

        scanner.close();
    }

    public static int determinarCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco + 3;
        } else if (idade >= 65 && idade <= 70) {
            return grupoRisco + 6;
        } else {
            return -1;
        }
    }
}
