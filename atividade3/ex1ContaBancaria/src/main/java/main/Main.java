package main;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 123, 10);
        ContaEspecial contaEspecial = new ContaEspecial("José", 234, 1000.0);

        contaPoupanca.sacar(1000.0);
        contaEspecial.sacar(2000.0);

        contaPoupanca.depositar(200);
        contaEspecial.depositar(300);

        contaPoupanca.sacar(100.0);
        contaEspecial.sacar(55.0);

        contaPoupanca.calcularNovoSaldo(0.1);

        System.out.println("Conta Poupança: Conta = "+contaPoupanca.getNumConta()+ ", Cliente = " + contaPoupanca.getCliente() + ", Saldo = " + contaPoupanca.getSaldo());
        System.out.println("Conta Especial: Conta = "+contaEspecial.getNumConta()+ ", Cliente = " + contaEspecial.getCliente() + ", Saldo = " + contaEspecial.getSaldo());
    }

}
