import java.util.Scanner;

public class Ex7 {
    public static void executar(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double percentualImpostos = 0.45;
        double percentualDistribuidor = 0.28;

        double valorImpostos = custoFabrica * percentualImpostos;
        double valorDistribuidor = (custoFabrica + valorImpostos) * percentualDistribuidor;

        double custoConsumidor = custoFabrica + valorImpostos + valorDistribuidor;

        System.out.println("O custo ao consumidor do carro é: R$ " + custoConsumidor);

        scanner.close();
    }
}
