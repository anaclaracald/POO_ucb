package entities;

public class Produto {

    String nome;
    double preco;
    int codigo;

    Produto() {}

    public Produto(String nome, double preco, int n) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = n + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigo() {
        return codigo;
    }
}