public class Ex16 {
    public static void executar(String[] args) {
        int totalFuncionarios = 584;
        double salarioMinimo = 1100;

        double reajusteTotal = 0;

        for (int i = 1; i <= totalFuncionarios; i++) {
            double salarioAtual = calcularSalarioAtual();

            double novoSalario;

            if (salarioAtual < 3 * salarioMinimo) {
                novoSalario = salarioAtual * 1.5;
            } else if (salarioAtual <= 10 * salarioMinimo) {
                novoSalario = salarioAtual * 1.2;
            } else if (salarioAtual <= 20 * salarioMinimo) {
                novoSalario = salarioAtual * 1.15;
            } else {
                novoSalario = salarioAtual * 1.1;
            }

            double reajuste = novoSalario - salarioAtual;
            reajusteTotal += reajuste;
        }

        System.out.println("Total de reajuste para os 584 funcionários: R$ " + reajusteTotal);
    }

    public static double calcularSalarioAtual() {
        return 0;
    }
}
