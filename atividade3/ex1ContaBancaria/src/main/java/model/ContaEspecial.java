package model;

public class ContaEspecial extends ContaBancaria {
    private Double limite;

    public ContaEspecial(String cliente, Integer numConta, Double limite) {
        super(cliente, numConta);
        this.limite = limite;
        saldo += limite;
    }

    @Override
    public void sacar(double valor) {
        if(valor<= saldo){
            saldo -= valor;
            System.out.println("Você acaba de sacar "+ valor +" reais da sua conta, "+getCliente()+".");
        }else{
            System.out.println("Saldo indisponível para esse saque, "+getCliente()+". Saldo: R$" + saldo);
        }
    }
}
