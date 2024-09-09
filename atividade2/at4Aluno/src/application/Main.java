package application;


//• Primeiro trimestre vale 30 pontos;
//• Segundo e terceiro trimestre valem 35 pontos cada.
//Apresente a nota final, considerando o somatório dos três trimestres. O programa deve
//realizar as seguintes validações:
//• Se o usuário digitar uma nota fora do intervalo de cada trimestre, o programa
//deverá solicitar a digitação novamente, até que o usuário informe a nota dentro
//do intervalo correto. Utilize a estrutura de repetição (while).
//• Após o somatório das notas, informe se o aluno está aprovado (maior ou igual a
//70) ou reprovado (menor que 70). Em caso de reprovação, informe quantos
//pontos faltam para ele obter o mínimo para ser aprovado

import entities.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        Aluno tempAluno = new Aluno();

        double nota1 = tempAluno.validaNota(sc, "Digite a nota do primeiro trimestre (0 a 30): ", 0, 30);
        double nota2 = tempAluno.validaNota(sc, "Digite a nota do segundo trimestre (0 a 35): ", 0, 35);
        double nota3 = tempAluno.validaNota(sc, "Digite a nota do terceiro trimestre (0 a 35): ", 0, 35);

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double notaFinal = aluno.notaTotal();
        System.out.printf("Nota final do aluno %s: %.2f%n", aluno.getName(), notaFinal);

        if (aluno.aprovado()) {
            System.out.println("Aluno aprovado!");
        } else {
            double pontosFaltando = 70 - notaFinal;
            System.out.printf("Aluno reprovado! Faltaram %.2f pontos para aprovação.%n", pontosFaltando);
        }

        sc.close();
    }
}

