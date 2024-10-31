package model;

public class ContaPoupanca extends ContaBancaria {
    final private Integer diaRendimento;

    public ContaPoupanca(String cliente, Integer numConta, Integer diaRendimento) {
        super(cliente, numConta);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendimento){
        saldo += saldo*taxaRendimento;
        System.out.println("Saldo de "+getCliente() + " atualizado R$"+ saldo + ".");
    }

}
