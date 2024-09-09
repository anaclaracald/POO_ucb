import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(new Locale("pt", "BR"));
        String salario = JOptionPane.showInputDialog("Digite o salario: ");

        double salarioInicial = Double.parseDouble(salario);
        double aumentoSalario = salarioInicial*0.15;

        JOptionPane.showMessageDialog(null, "Salário inicial: R$"+ String.format("%.2f", salarioInicial) +
                "\nNovo salário: R$" +String.format("%.2f", salarioInicial += aumentoSalario));

        sc.close();
    }
}
