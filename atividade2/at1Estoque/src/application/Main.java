package application;

import entities.Produto;

import java.util.Scanner;


//• Realize uma entrada no estoque e mostre novamente os dados do produto;
//• Realize uma saída no estoque e mostre novamente os dados do produto. O
//programa deve realizar a seguinte validação:
//o Se a quantidade informada exceder a quantidade disponível no estoque,
//apresente uma mensagem ao usuário, informando tal situação.

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Produto:\nDigite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço do produto: R$");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade atual no estoque: ");
        int quantidade = sc.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println(produto);

        System.out.print("Quantos produtos para entrada de estoque?");
        produto.entradaEstoque(sc.nextInt());
        System.out.println(produto);

        System.out.print("Quantos produtos para saída de estoque?");
        produto.saidaEstoque(sc.nextInt());
        System.out.println(produto);

        sc.close();
    }
}
