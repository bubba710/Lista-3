import java.util.Scanner;

public class Ex12 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        String continuar;

        do {
            System.out.println("Digite o ano do carro: ");
            int ano = scanner.nextInt();

            System.out.println("Digite o valor do carro: ");
            double valorCarro = scanner.nextDouble();

            double desconto;
            if (ano <= 2000) {
                desconto = valorCarro * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valorCarro * 0.07;
            }

            double valorAPagar = valorCarro - desconto;

            System.out.println("Desconto: R$ " + desconto);
            System.out.println("Valor a ser pago: R$ " + valorAPagar);

            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        scanner.close();
    }
}
