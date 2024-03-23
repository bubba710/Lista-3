import java.util.Scanner;

public class Ex13 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int totalAptas = 0;
        int totalNaoAptas = 0;

        System.out.println("Quantas pessoas deseja avaliar? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nDados da pessoa " + i + ":");
            System.out.println("Nome: ");
            String nome = scanner.next();

            System.out.println("Sexo (M/F): ");
            String sexoStr = scanner.next();
            char sexo = sexoStr.toUpperCase().charAt(0);

            System.out.println("Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Saúde (A para apta, N para não apta): ");
            String saudeStr = scanner.next();
            char saude = saudeStr.toUpperCase().charAt(0);

            if ((idade >= 18 && sexo == 'M') && saude == 'A') {
                System.out.println(nome + " está apto para o serviço militar.");
                totalAptas++;
            } else {
                System.out.println(nome + " não está apto para o serviço militar.");
                totalNaoAptas++;
            }

            totalPessoas++;
        }

        System.out.println("\nTotal de pessoas avaliadas: " + totalPessoas);
        System.out.println("Total de aptos: " + totalAptas);
        System.out.println("Total de não aptos: " + totalNaoAptas);

        scanner.close();
    }
}
