package entities;

import java.util.Scanner;

public class Aluno {
    private String name;
    private Double nota1, nota2, nota3;

    public Aluno() {
    }

    public Aluno(String name, Double nota1, Double nota2, Double nota3) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public Double notaTotal(){
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado(){
        return notaTotal() >= 70;
    }

    public double validaNota(Scanner sc, String mensagem, double min, double max){
        double nota;
        do{
            System.out.print(mensagem);
            nota = sc.nextDouble();
            if ( nota < min || nota > max){
                System.out.println("Nota inválida");
            }
        }while(nota < min || nota > max);
        return nota;
    }
}
