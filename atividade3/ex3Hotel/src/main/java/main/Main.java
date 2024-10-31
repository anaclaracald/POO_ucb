package main;

import model.QuartoDuplo;
import model.QuartoSimples;
import model.Suite;
import model.Acomodacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o tipo de acomodação (1-Quarto Simples, 2-Quarto Duplo, 3-Suíte): ");
        int tipoAcomodacao = scanner.nextInt();

        System.out.print("Quantos dias será utilizada a acomodação? ");
        int dias = scanner.nextInt();

        System.out.print("Quantas pessoas utilizarão a acomodação? ");
        int numeroPessoas = scanner.nextInt();

        Acomodacao acomodacao;

        switch (tipoAcomodacao) {
            case 1:
                acomodacao = new QuartoSimples();
                break;
            case 2:
                acomodacao = new QuartoDuplo();
                break;
            case 3:
                acomodacao = new Suite();
                break;
            default:
                System.out.println("Tipo de acomodação inválido!");
                return;
        }

        System.out.print("Deseja adicionar café da manhã? (sim/não): ");
        boolean incluirCafe = scanner.next().equalsIgnoreCase("sim");

        System.out.print("Deseja adicionar limpeza extra? (sim/não): ");
        boolean incluirLimpeza = scanner.next().equalsIgnoreCase("sim");

        acomodacao.exibirDetalhes(dias, numeroPessoas, incluirCafe, incluirLimpeza);
    }
    }

