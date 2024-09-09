import javax.swing.*;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String anoNascimento = JOptionPane.showInputDialog("Digite o ano do seu nascimento: ");

        int anoNascimentoI = Integer.parseInt(anoNascimento);
        int anoAtual = Year.now().getValue();

        int idade = anoAtual - anoNascimentoI;

        JOptionPane.showMessageDialog(null, "Você se chama "+ nome + " e você tem "+ idade+ " anos de idade.");

        sc.close();
    }
}
