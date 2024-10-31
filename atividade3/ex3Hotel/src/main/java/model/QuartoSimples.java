package model;

public class QuartoSimples implements Acomodacao, ServicoAdicional {
    private static final double diaria = 100;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double totalSimples = 0;
        if (incluirCafe) totalSimples += 20 * numeroPessoas * dias;
        if (incluirLimpeza) totalSimples += 30 * dias;
        return totalSimples;
    }

    @Override
    public void exibirDetalhes(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double custoTotal = (calcularDiaria() * dias) + calcularServico(dias, numeroPessoas, incluirCafe, incluirLimpeza);
        System.out.println("Acomodação: Quarto Simples");
        System.out.println("Dias: " + dias + ", Pessoas: " + numeroPessoas);
        System.out.println("Custo total: R$" + custoTotal);
    }
}
