import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final double PI = 3.1415;

        String raio = JOptionPane.showInputDialog("Digite o raio do círculo: ");

        double raioDb = Double.parseDouble(raio);
        double area = PI * Math.pow(raioDb, 2);

        JOptionPane.showMessageDialog(null, "\nÁrea do círculo: " + String.format("%.4f", area));

        sc.close();
    }
}
