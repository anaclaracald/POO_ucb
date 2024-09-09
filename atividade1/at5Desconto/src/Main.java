import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(new Locale("pt","BR"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$");
        double preco = sc.nextDouble();

        System.out.print("Qual o valor da porcentagem de desconto? ");
        double desconto = sc.nextDouble();

        double precoFinal = preco - (preco*(desconto/100));

        System.out.println("Valor final do produto: R$"+ String.format("%.3f", precoFinal));

        sc.close();
    }
}
