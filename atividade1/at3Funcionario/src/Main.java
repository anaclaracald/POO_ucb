import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de horas trabalhadas: ");
        double numHoras = sc.nextDouble();

        System.out.print("Salário por hora: ");
        double horaSalario = sc.nextDouble();

        double salary = numHoras * horaSalario;

        System.out.println("Salário desse funcionario: R$"+ String.format("%.2f", salary));

        sc.close();
    }
}
