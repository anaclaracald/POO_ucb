package entities;


import java.lang.reflect.Type;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidadeEstoque;

    public Produto(){
    }

    public Produto(String nome, Double preco, Integer quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    private Double valorTotalEstoque(){
        return preco * quantidadeEstoque;
    }

    public Integer entradaEstoque(Integer num){
        return quantidadeEstoque += num;
    }

    public Integer saidaEstoque(Integer num){
        if (quantidadeEstoque < num){
            System.out.println("Quantidade em estoque indisponível!");
            return null;
        }else{
            return quantidadeEstoque -= num;
        }
    }

    @Override
    public String toString() {
        return "\nProduto:" +
                "\nNome: '" + nome + '\'' +
                "\nPreco: " + preco +
                "\nQuantidadeEstoque: " + quantidadeEstoque +
                "\nValor total: " + valorTotalEstoque() + "\n";
    }
}
