package model;

public class ContaBancaria {
    private String cliente;
    private Integer numConta;
    protected Double saldo;

    public ContaBancaria(String cliente, int numConta) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = 0.0;
    }

    public String getCliente() {
        return cliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
        if(saldo>= valor){
            saldo -= valor;
            System.out.println("Você acaba de sacar "+ valor +" reais da sua conta, "+getCliente()+".");
        }else{
            System.out.println("Saldo indisponível para esse saque, "+cliente+". Saldo: R$" + saldo);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Saldo de "+cliente + " atualizado R$"+ saldo + ".");
    }

}
