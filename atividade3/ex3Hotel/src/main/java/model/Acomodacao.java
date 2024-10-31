package model;

public interface Acomodacao {
    double calcularDiaria();
    void exibirDetalhes(int dias, int numeroPessoas, boolean incluirCafe, boolean incluirLimpeza);
}
