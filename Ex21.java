import java.util.Scanner;

public class Ex21 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria = classificarNadador(idade);

        if (!categoria.equalsIgnoreCase("Fora da faixa etária")) {
            System.out.println("O nadador está na categoria " + categoria);
        } else {
            System.out.println("Idade fora da faixa etária");
        }

        scanner.close();
    }

    public static String classificarNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Fora da faixa etária";
        }
    }
}
