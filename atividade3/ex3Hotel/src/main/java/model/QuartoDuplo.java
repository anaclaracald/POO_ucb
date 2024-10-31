package model;

public class QuartoDuplo implements Acomodacao, ServicoAdicional {
    private static final double diaria = 180;

    @Override
    public double calcularDiaria() {
        return diaria;
    }

    @Override
    public double calcularServico(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double totalDuplo = 0;
        if (incluirCafe) totalDuplo += 20 * numeroPessoas * dias;
        if (incluirLimpeza) totalDuplo += 30 * dias;
        return totalDuplo;
    }

    @Override
    public void exibirDetalhes(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza) {
        double custoTotal = (calcularDiaria() * dias) + calcularServico(dias, numeroPessoas, incluirCafe, incluirLimpeza);
        System.out.println("Acomodação: Quarto Simples");
        System.out.println("Dias: " + dias + ", Pessoas: " + numeroPessoas);
        System.out.println("Custo total: R$" + custoTotal);
    }
}
