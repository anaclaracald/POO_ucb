package model;

public class Suite implements Acomodacao, ServicoAdicional {
    private static final double diaria = 350;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double totalSuite = 0;
        if (incluirCafe) totalSuite += 20 * numeroPessoas * dias;
        if (incluirLimpeza) totalSuite += 30 * dias;
        return totalSuite;
    }

    @Override
    public void exibirDetalhes(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double custoTotal = (calcularDiaria() * dias) + calcularServico(dias, numeroPessoas, incluirCafe, incluirLimpeza);
        System.out.println("Acomodação: Quarto Simples");
        System.out.println("Dias: " + dias + ", Pessoas: " + numeroPessoas);
        System.out.println("Custo total: R$" + custoTotal);
    }
}
