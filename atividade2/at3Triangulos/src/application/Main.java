package application;

import entities.Triangulo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o nome do triangulo (ex:Triangulo a):");String nomex = sc.nextLine();
        System.out.printf("\nDigite os lados do %s: ", nomex);
        System.out.print("\nLado A: ");double xA = sc.nextDouble();
        System.out.print("Lado B: ");double xB = sc.nextDouble();
        System.out.print("Lado C: ");double xC = sc.nextDouble();

        sc.nextLine();
        System.out.print("\nDigite o nome do triangulo (ex:Triangulo a): ");String nomey = sc.nextLine();
        System.out.printf("\nDigite os lados do %s: ", nomey);
        System.out.print("\nLado A: ");double yA = sc.nextDouble();
        System.out.print("Lado B: ");double yB = sc.nextDouble();
        System.out.print("Lado C: ");double yC = sc.nextDouble();

        Triangulo trianguloX = new Triangulo(nomex, xA,xB,xC);
        Triangulo trianguloY = new Triangulo(nomey, yA,yB,yC);

        System.out.println("Area triangulo X: " + String.format("%.2f", trianguloX.areaTriangulo()));
        System.out.println("Area triangulo Y: " + String.format("%.2f", trianguloY.areaTriangulo()));

        Triangulo maiorTriangulo = trianguloX.maiorArea(trianguloY);

        System.out.println(maiorTriangulo);
        
        sc.close();
    }
}
