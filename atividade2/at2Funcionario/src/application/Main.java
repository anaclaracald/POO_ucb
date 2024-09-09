package application;

//Faça um programa que leia os dados de um funcionário (nome e salário). Em seguida,
//aplique um aumento com base no salário do funcionário a saber:
//• Se o salário do funcionário estiver entre 1 e 1000, aplique um aumento de 15%;
//• Se o salário do funcionário estiver entre 1001 e 1500, aplique um aumento de
//10%;
//• Se o salário do funcionário estiver entre 1501 e 2000, aplique um aumento de 5%.
//Ao final imprima o salário antigo e o atual do funcionário, de acordo com o aumento
//estabelecido.

import entities.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Funcionario: \nNome: ");
        String nome = sc.nextLine();

        System.out.print("Salario: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salario);

        System.out.println(funcionario);

        funcionario.aumentoSalario();

        System.out.println("Status atualizado:"+ funcionario);

        sc.close();
    }
}
