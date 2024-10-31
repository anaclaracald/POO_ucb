package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    int numero;
    double valorTotal;
    public int num_produtos = 0;
    List<Produto> listaProdutos = new ArrayList<>();

    public Pedido(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void aplicarDesconto() {
        if (valorTotal > 1000)
            valorTotal -= valorTotal * 0.2;
        else if (valorTotal > 500)
            valorTotal -= valorTotal * 0.15;
        else if (valorTotal > 200)
            valorTotal -= valorTotal * 0.1;
        else if (valorTotal > 100)
            valorTotal -= valorTotal * 0.05;

        System.out.println("O valor final do seu pedido é de R$"+ String.format("%.2f", valorTotal));
    }

    public void adicionarProduto(Produto novoProduto) {
        listaProdutos.add(novoProduto);
        valorTotal += novoProduto.preco;
        num_produtos++;
    }

    public void removerProduto(int codigo) {
        int i = codigo - 1;
        valorTotal -= listaProdutos.get(i).preco;
        listaProdutos.remove(i);
        num_produtos--;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\nPedido");
        for (Produto p : listaProdutos) {
            sb.append("\n\nCódigo: ").append(p.getCodigo());
            sb.append("\nNome: ").append(p.getNome());
            sb.append("\nPreço: ").append(String.format("%.2f", p.getPreco()));
        }
        return sb.toString();
    }

}