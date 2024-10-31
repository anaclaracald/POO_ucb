package application;

import entities.Pedido;
import entities.Produto;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pedido pedido1 = new Pedido(1);

        int opcao;

        do {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - listar produtos do pedido");
            System.out.println("3 - remover produto do pedido");
            System.out.println("4 - finalizar compra");
            System.out.println("5 - sair\n");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    sc.nextLine();
                    System.out.println("\nAdicionar produto");

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    Produto produto = new Produto(nome, preco, pedido1.num_produtos);
                    pedido1.adicionarProduto(produto);
                    System.out.println("\nProduto '"+ produto.getNome() + "' adicionado com sucesso!");
                    break;

                case 2:

                    System.out.println(pedido1);
                    break;

                case 3:
                    System.out.println("Qual o código do produto que deseja remover? ");
                    int codigo_input = sc.nextInt();

                    if (codigo_input < 1 || codigo_input > pedido1.num_produtos) {
                        System.out.println("Não há produtos com esse código.\n");
                        break;
                    }

                    pedido1.removerProduto(codigo_input);
                    System.out.println("Produto removido!");
                    break;

                case 4:
                    pedido1.aplicarDesconto();
                    System.out.println(pedido1);
                    System.out.println("Obrigada pelo seu pedido :)");
                    exit(0);
                case 5:
                    System.out.println("Tchau!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 5);

        sc.close();
    }
}