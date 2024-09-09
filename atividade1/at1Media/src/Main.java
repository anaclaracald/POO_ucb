import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Double> numeros = new ArrayList<>();
        double sum = 0;

        for (int i=0;i<5;i++){
            System.out.print("Numero "+ (i+1)+ ":");
            double n = sc.nextDouble();
            sum += n;
            numeros.add(n);

        }

        System.out.println("Numeros digitados: ");
        for (Object n: numeros){
            System.out.println(n);
        }

        System.out.println("A média dos números resulta em: "+ sum/5);

        sc.close();
    }
}
