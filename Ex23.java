import java.util.Scanner;

public class Ex23 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        double pesoIdeal = calcularPesoIdeal(sexo, altura, idade);
        System.out.println("O peso ideal de " + nome + " é: " + pesoIdeal + " kg");

        scanner.close();
    }

    public static double calcularPesoIdeal(char sexo, double altura, int idade) {
        double pesoIdeal;

        if (sexo == 'M') {
            if (altura > 1.70) {
                if (idade <= 20) {
                    pesoIdeal = 72.7 * altura - 58;
                } else if (idade >= 21 && idade <= 39) {
                    pesoIdeal = 72.7 * altura - 53;
                } else {
                    pesoIdeal = 72.7 * altura - 45;
                }
            } else {
                if (idade <= 40) {
                    pesoIdeal = 72.7 * altura - 50;
                } else {
                    pesoIdeal = 72.7 * altura - 58;
                }
            }
        } else { // Sexo 'F'
            if (altura > 1.50) {
                if (idade >= 35) {
                    pesoIdeal = 62.1 * altura - 45;
                } else {
                    pesoIdeal = 62.1 * altura - 49;
                }
            } else {
                if (idade >= 35) {
                    pesoIdeal = 62.1 * altura - 44.7;
                } else {
                    pesoIdeal = 62.1 * altura - 44;
                }
            }
        }

        return pesoIdeal;
    }
}
