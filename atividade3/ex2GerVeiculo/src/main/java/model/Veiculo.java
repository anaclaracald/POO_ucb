package model;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected Integer anoFabricacao;

    public Veiculo(String placa, String marca, String modelo, Integer anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract double calcularIPVA();
    public abstract void exibirDetalhes();
}
